import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-casepipe',
  templateUrl: './casepipe.component.html',
  styleUrls: ['./casepipe.component.css']
})
export class CasepipeComponent implements OnInit {

  constructor() { }
  message:string="My Name is Sonam and I am Java Certified Trainer";
  ngOnInit(): void {
  }

}
