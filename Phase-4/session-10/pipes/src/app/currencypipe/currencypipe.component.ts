import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-currencypipe',
  templateUrl: './currencypipe.component.html',
  styleUrls: ['./currencypipe.component.css']
})
export class CurrencypipeComponent implements OnInit {

  constructor() { }
  a:number=42165.67;
  b:number=7638.99020;
  ngOnInit(): void {
  }

}
