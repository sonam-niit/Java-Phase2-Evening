import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Todo } from './todo.model';

@Injectable({
  providedIn: 'root'
})
export class TodoService {

  constructor(private http:HttpClient) { }

  baseUrl:string="https://jsonplaceholder.typicode.com/todos/";

  getAllTodos():Observable<Todo[]>{
    return this.http.get<Todo[]>(this.baseUrl);
  }
}
