import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { ActivatedRoute, Router } from '@angular/router';
import { Customer } from '../Customer';
import { CustomerService } from '../customer.service';

@Component({
  selector: 'app-editcust',
  templateUrl: './editcust.component.html',
  styleUrls: ['./editcust.component.css']
})
export class EditcustComponent implements OnInit {

  cust:Customer;
  id:string|null;
  registerForm:FormGroup;
  submitted:boolean=false;
  constructor(private service:CustomerService,private activatedroute:ActivatedRoute,
    private builder:FormBuilder,private router:Router) { }

  ngOnInit(): void {
    this.id= this.activatedroute.snapshot.paramMap.get('id');
    this.service.getCustomerById(Number(this.id)).subscribe(x=>this.cust=x);

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
        this.service.updateCustomer(this.cust,Number(this.id))
        .subscribe(x=>console.log(x));
        alert("Data Updated Successfully")
        this.router.navigate(['list'])
    }
  }
}
