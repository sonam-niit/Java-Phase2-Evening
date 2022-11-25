import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { Router } from '@angular/router';
import { Customer } from '../Customer';
import { CustomerService } from '../customer.service';

@Component({
  selector: 'app-addcust',
  templateUrl: './addcust.component.html',
  styleUrls: ['./addcust.component.css']
})
export class AddcustComponent implements OnInit {

  cust:Customer= new Customer();
  constructor(private builder:FormBuilder,private service:CustomerService,
    private router:Router) { }

  registerForm:FormGroup;
  submitted:boolean=false;
  ngOnInit(): void {
    this.registerForm=this.builder.group({
      name:['',Validators.required],
      email:['',[Validators.required,Validators.email]],
      address:['',Validators.required]
    })
  }

  get form(){
    return this.registerForm.controls;
  }

  onSubmit(){
    this.submitted=true;
    if(this.registerForm.invalid)
      return
    else{
        this.service.saveCustomer(this.cust).subscribe(x=>console.log(x));
        this.router.navigate(['list'])
    }
  }
}
