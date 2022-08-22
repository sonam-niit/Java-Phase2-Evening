import { Component, OnInit } from '@angular/core';
import { Todo } from '../todo.model';
import { TodoService } from '../todo.service';

@Component({
  selector: 'app-todolist',
  templateUrl: './todolist.component.html',
  styleUrls: ['./todolist.component.css']
})
export class TodolistComponent implements OnInit {

  constructor(private service:TodoService) { }

  todos:Todo[];
  ngOnInit(): void {
      this.service.getAllTodos().subscribe(x=>this.todos=x);
  }

}
