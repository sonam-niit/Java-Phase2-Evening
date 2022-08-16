import { Location } from '@angular/common';
import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { ActivatedRoute, Router } from '@angular/router';
import { User } from '../model/user.model';
import { UserService } from '../user.service';

@Component({
  selector: 'app-edituser',
  templateUrl: './edituser.component.html',
  styleUrls: ['./edituser.component.css']
})
export class EdituserComponent implements OnInit {

  registerForm: FormGroup;
  submitted: boolean = false;
  constructor(private service:UserService,private route:ActivatedRoute,
    private location:Location,private builder: FormBuilder,
    private router:Router) { }
  user:User=new User();
  id:string | null;
  ngOnInit(): void {
    this.id= this.route.snapshot.paramMap.get('id');
    this.service.getUserById(Number(this.id)).subscribe(x=>this.user=x);

    this.registerForm = this.builder.group({
      name: ['', Validators.required],
      email: ['', [Validators.required, Validators.email]],
      password: ['', [Validators.required, Validators.minLength(8)]],
      country: ['', Validators.required],

    })
  }
  goback(){
    this.location.back();
  }

  get form() {
    return this.registerForm.controls;
  }
  onSubmit() {
    this.submitted = true;
    if (this.registerForm.invalid)
      return;
    else {
      //console.log(this.user)
      this.service.editUser(this.user,Number(this.id)).subscribe(resp=>console.log(resp))
      this.router.navigate(['list']);
      //alert("Form submitted for the Approval ")
    }
  }

}
