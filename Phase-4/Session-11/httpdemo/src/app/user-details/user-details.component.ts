import { Location } from '@angular/common';
import { Component, OnInit } from '@angular/core';
import { ActivatedRoute } from '@angular/router';
import { User } from '../model/user.model';
import { UserService } from '../user.service';

@Component({
  selector: 'app-user-details',
  templateUrl: './user-details.component.html',
  styleUrls: ['./user-details.component.css']
})
export class UserDetailsComponent implements OnInit {

  constructor(private service:UserService,private route:ActivatedRoute,
    private location:Location) { }
  user:User;
  ngOnInit(): void {
    const id= this.route.snapshot.paramMap.get('id');
    this.service.getUserById(Number(id)).subscribe(x=>this.user=x)
  }

  goback(){
    this.location.back();
  }
}
