import { Component, OnInit } from '@angular/core';
import { User } from '../model/user.model';
import { UserService } from '../user.service';

@Component({
  selector: 'app-userlist',
  templateUrl: './userlist.component.html',
  styleUrls: ['./userlist.component.css']
})
export class UserlistComponent implements OnInit {

  constructor(private service: UserService) { }
  users:User[];

  ngOnInit(): void {
    this.service.getAllUsers().subscribe(x=>this.users=x);
  }

  delete(id:number):void{
    this.users= this.users.filter(u=>u.id!==id)
    this.service.deleteUserById(id).subscribe(resp=>console.log(resp));
  }
}
