import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-eventbinding',
  templateUrl: './eventbinding.component.html',
  styleUrls: ['./eventbinding.component.css']
})
export class EventbindingComponent implements OnInit {

  constructor() { }
  ngOnInit(): void {
  }
  displayAlert():void{
    alert("Display Method Called")
  }
  visible:boolean=false;
  imgUrl:string="./assets/image.png";
  imgFlag:boolean=false;
  btnName:string="Show Image"
  showImage():void{
    this.imgFlag=!this.imgFlag;
    if(this.imgFlag==true)
      this.btnName="Hide Image"
    else
      this.btnName="Show Image"
  }
  show():void{
    this.visible=!this.visible;
    console.log(this.visible);
  }

}
