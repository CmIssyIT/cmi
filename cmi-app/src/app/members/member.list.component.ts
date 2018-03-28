import {Component, OnInit} from '@angular/core';
import {MemberService} from "./member.service";
import {MemberRole} from "./memberRole";

@Component({
  templateUrl: './member.list.component.html',
  styleUrls: ['./member.list.component.css']
})
export class MemberListComponent implements OnInit {

  members: any;
  search = "";
  role = "";
  order= {
    field: "firstName",
    asc: true
  };
  classe = "";

  private memberRoles = MemberRole;

  constructor(private memberService: MemberService) {
    this.members = this.memberService.list();
  }

  ngOnInit() {

  }

  orderBy(field) {
    this.order.field = field;
    this.order.asc = !this.order.asc;
  }
  getMembers() {
    let members = this.filterMember();
    return members.sort((m1, m2) => {
      let val1 = m1[this.order.field];
      let val2 = m2[this.order.field];
      return this.order.asc ? val2 < val1 : val1 < val2;
    });
  }

  filterMember() {
      return this.members.filter(it => {
        let nameCompatible = true;
        if(this.search) {
          let val1 = this.search.toLowerCase();
          let val2 = it['firstName'].toLowerCase();
          nameCompatible = val2.indexOf(val1) >= 0;
        }
        let roleCompatible = true;
        if(this.role && this.role !== 'all') {
          roleCompatible = it.role.id == this.role
        }
        let classeCompatible = true;
        if(this.classe && this.classe !== 'all') {
          classeCompatible = it.classe == this.classe
        }
        console.log("classCompatible",classeCompatible);
        console.log("it.classe",it.classe);
        console.log("this.class",this.classe);
        return classeCompatible && roleCompatible && nameCompatible;
      });
  }

  getIconOrderBy (field) {
    if(field == this.order.field){
      return this.order.asc ? "fa-chevron-down" : "fa-chevron-up";
    }
    return "fa-sort";
  }
  filterText() {
    this.members
  }
}
