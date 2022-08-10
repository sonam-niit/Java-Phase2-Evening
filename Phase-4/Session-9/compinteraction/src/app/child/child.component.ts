import { Component, EventEmitter, OnInit } from '@angular/core';

@Component({
  selector: 'app-child',
  templateUrl: './child.component.html',
  styleUrls: ['./child.component.css'],
  inputs:['parentdata'],
  outputs:['myEvent']
})
export class ChildComponent implements OnInit {

  parentdata:string=""
  constructor() { }

  ngOnInit(): void {
  }
  myEvent= new EventEmitter();
  onChange(value:String){
    this.myEvent.emit(value);
  }

}
