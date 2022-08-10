import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-product',
  templateUrl: './product.component.html',
  styleUrls: ['./product.component.css']
})
export class ProductComponent implements OnInit {

  green:string="green";
  products=[
    {id:1,name:"pencil",price:10.23,availabiliy:"22-08-2022",
    rating:4.5},
    {id:2,name:"pen",price:10.23,availabiliy:"22-08-2022",rating:4.2},
    {id:3,name:"scale",price:10.23,availabiliy:"22-08-2022",rating:4.4},
    {id:4,name:"paper",price:10.23,availabiliy:"22-08-2022",rating:4.7}
  ]
  constructor() { }

  ngOnInit(): void {
  }

}
