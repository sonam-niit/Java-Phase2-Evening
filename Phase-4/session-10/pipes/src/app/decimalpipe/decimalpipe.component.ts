import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-decimalpipe',
  templateUrl: './decimalpipe.component.html',
  styleUrls: ['./decimalpipe.component.css']
})
export class DecimalpipeComponent implements OnInit {

  constructor() { }
  pi:number=3.1415927;
  ngOnInit(): void {
  }

}
