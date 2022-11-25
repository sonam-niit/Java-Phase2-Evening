import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { Customer } from '../Customer';
import { CustomerService } from '../customer.service';

@Component({
  selector: 'app-custdetails',
  templateUrl: './custdetails.component.html',
  styleUrls: ['./custdetails.component.css']
})
export class CustdetailsComponent implements OnInit {

  constructor(private service:CustomerService, private activatedRoute:ActivatedRoute) { }

  customer:Customer
  ngOnInit(): void {
      const id=this.activatedRoute.snapshot.paramMap.get('id');
      this.service.getCustomerById(Number(id)).subscribe(data=>this.customer=data);
  }

}
