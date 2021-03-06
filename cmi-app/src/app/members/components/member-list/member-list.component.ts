import {Component, NgZone, OnInit} from '@angular/core';
import {Role} from './role';
import {MemberService} from '../../services/member.service';
import {Member} from './member';

@Component({
  templateUrl: './member-list.component.html',
  styleUrls: ['./member-list.component.css']
})
export class MemberListComponent implements OnInit {

  members: Member [];
  public search = '';
  public maxPageSize = 2;
  public currentPage = 0;
  public role = 3;
  public length = 0;
  public pages = [];
  order = {
    field: 'firstName',
    asc: true
  };
  public classe = '';

  private memberRoles = Role;

  constructor(private memberService: MemberService, private zone: NgZone) {
    this.memberService.list().subscribe(data => this.members = data);
  }

  ngOnInit() {
  }

  orderBy(field) {
    this.order.field = field;
    this.order.asc = !this.order.asc;
  }
  getMembers() {
    if ( !this.members ) {
      return;
    }
    const filtredMemebers = this.filterMember();
    let result =  filtredMemebers.sort((m1, m2) => {
      const val1 = m1[this.order.field];
      const val2 = m2[this.order.field];
      const sortValue: boolean =  this.order.asc ? val2 < val1 : val1 < val2;
      if (sortValue) {
        return -1;
      } else {
        return 1;
      }
    });

    this.length  = ~~((result.length/ this.maxPageSize) +1);

    setTimeout(()=> {
      this.pages = Array.from(Array(length).keys());
    },);
     return result.slice(this.currentPage*this.maxPageSize, this.maxPageSize*(this.currentPage + 1));
  }

  filterMember(): Member [] {
    return this.members.filter(it => {
      let nameCompatible = true;
      if (this.search) {
        const val1 = this.search.toLowerCase();
        const val2 = it['firstName'].toLowerCase();
        nameCompatible = val2.indexOf(val1) >= 0;
      }
      let roleCompatible = true;
      if (this.role && this.role !== 3) {
        roleCompatible = it.role.id == this.role;
      }
      let classeCompatible = true;
      if (this.classe && this.classe !== 'all') {
        classeCompatible = (it.classe) && it.classe.toLowerCase() === this.classe.toLowerCase();
      }
      return classeCompatible && roleCompatible && nameCompatible;
    });
  }

  maxPageSizeChange() {
    console.log("maxPageSizeChange test")
    this.currentPage = 0;
  }

  getPages() {
    return Array.from(Array(this.length).keys());
  }

  detailStudent() {
    alert("detail");
  }

  getIconOrderBy (field) {
    if (field === this.order.field) {
      return this.order.asc ? 'fa-chevron-down' : 'fa-chevron-up';
    }
    return 'fa-sort';
  }
}
