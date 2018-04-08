import {Injectable} from '@angular/core';
import 'rxjs/add/operator/toPromise';
import 'rxjs/add/operator/map';
import 'rxjs/add/operator/filter';
import {HttpClient} from '@angular/common/http';
import {Observable} from 'rxjs/Observable';
import {Member} from '../components/member-list/member';

@Injectable()
export class MemberService {

  private meUrl = '/me';
  private usersUrl = '/users';

  constructor(private http: HttpClient) {}

  list(): Observable<Member[]> {
    return this.http.get<Member []>('http://localhost:8080/members');
    //return members;
  }

}


const members = [{
  "lastName": "ABGiacomo1",
  "firstName": "Guilizzo1",
  "birthday": 1502256227073,
  "age": 30,
  "role": {
    label: "Enseignant",
    id: 1
  },
  "gender": "M",
  "status": "Actif",
  "classe": "Coran Niv1"
},
  {
    "lastName": "ACGiacomo2",
    "firstName": "AAGuilizzo2",
    "birthday": 1522256827073,
    "age": 28,
    "role": {
      label: "Elève",
      id: 0
    },
    "gender": "F",
    "classe": "Coran Niv2",
    "status": "Actif"
  },
  {
    "lastName": "ADGiacomo3",
    "firstName": "BBGuilizzo3",
    "birthday": 1522256227073,
    "age": 17,
    "role": {
      label: "Enseignant",
      id: 1
    },
    "gender": "M",
    "status": "Actif",
    "classe": "Coran Niv2"
  },
  {
    "lastName": "eGiacomo4",
    "firstName": "AAGuilizzo4",
    "birthday": 1478496544151,
    "age": 31,
    "role": {
      label: "Elève",
      id: 0
    },
    "gender": "M",
    "status": "Actif",
    "classe": "Coran Niv1"
  },
  {
    "lastName": "Giacomo4",
    "firstName": "BGuilizzo4",
    "birthday": 1523256227073,
    "age": 31,
    "role": {
      label: "Elève",
      id: 0
    },
    "gender": "F",
    "status": "Actif",
    "classe": "Arabe Rawdati"
  },
  {
    "lastName": "Giacomo6",
    "firstName": "Guilizzo6",
    "birthday": 1522256247073,
    "age": 8,
    "role": {
      label: "Enseignant",
      id: 1
    },
    "gender": "F",
    "status": "Actif",
    "classe": "Arabe Rawdati"
  },
  {
    "lastName": "Giacomo5",
    "firstName": "Guilizzo5",
    "birthday": 1222256227073,
    "age": 31,
    "role": {
      label: "Responsable d'élève",
      id: 2
    },
    "gender": "F",
    "status": "Actif",
    "classe": "Arabe Rawdati"
  }];

