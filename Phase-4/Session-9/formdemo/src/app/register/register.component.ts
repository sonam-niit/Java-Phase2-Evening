import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';

@Component({
  selector: 'app-register',
  templateUrl: './register.component.html',
  styleUrls: ['./register.component.css']
})
export class RegisterComponent implements OnInit {

  //form declared
  registerForm: FormGroup;
  submitted: boolean = false;
  //builder dependency injected through constructor
  constructor(private builder: FormBuilder) { }

  ngOnInit(): void {
    this.registerForm = this.builder.group({
      firstName: ['', Validators.required],
      lastName: ['', Validators.required],
      email:['',[Validators.required,Validators.email]],
      password:['',[Validators.required,Validators.minLength(8)]]

    })
  }
  get form() {
    return this.registerForm.controls;
  }
  onSubmit() {
    this.submitted = true;
    setTimeout(()=>{this.submitted=false},3000)
    if (this.registerForm.invalid)
      return;
    else
      alert("Form submitted for the Approval")
  }

}
