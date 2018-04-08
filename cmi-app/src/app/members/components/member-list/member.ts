import {Role} from "./role";

export class Member {

  firstName: string;
  lastName: string;
  classe: string;
  age: number;
  role: Role;

  constructor(firstName: string, lastName: string, classe: string, age: number, role: Role) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.classe = classe;
    this.age = age;
    this.role = role;
  }
}
