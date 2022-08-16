import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { Router } from '@angular/router';
import { User } from '../model/user.model';
import { UserService } from '../user.service';

@Component({
  selector: 'app-add-user',
  templateUrl: './add-user.component.html',
  styleUrls: ['./add-user.component.css']
})
export class AddUserComponent implements OnInit {
  //form declared
  user: User = new User();
  registerForm: FormGroup;
  submitted: boolean = false;
  //builder dependency injected through constructor
  constructor(private builder: FormBuilder, 
    private service: UserService,private router:Router) { }

  ngOnInit(): void {
    this.registerForm = this.builder.group({
      name: ['', Validators.required],
      email: ['', [Validators.required, Validators.email]],
      password: ['', [Validators.required, Validators.minLength(8)]],
      country: ['', Validators.required],

    })
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
      this.service.addUser(this.user).subscribe(resp=>console.log(resp))
      this.router.navigate(['list']);
      //alert("Form submitted for the Approval ")
    }
  }


}
