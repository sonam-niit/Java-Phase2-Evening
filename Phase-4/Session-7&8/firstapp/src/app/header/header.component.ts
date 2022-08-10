import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-header',
  templateUrl: './header.component.html',
  styleUrls: ['./header.component.css']
})
export class HeaderComponent implements OnInit {

  constructor() { }

  ngOnInit(): void {
  }
  altText:string="Simplilearn Logo";
  imgurl:string="./assets/image.png";
  h:number=100;
  w:number=150;
  urlLink:string="https://www.google.com"
  title:string="Welcometo Simplilearn"

}
