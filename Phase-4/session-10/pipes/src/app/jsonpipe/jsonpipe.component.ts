import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-jsonpipe',
  templateUrl: './jsonpipe.component.html',
  styleUrls: ['./jsonpipe.component.css']
})
export class JsonpipeComponent implements OnInit {

  constructor() { }
  object={"fname":"sonam","lname":"soni","email":"sonam@gmail.com"}
  ngOnInit(): void {
  }

}
