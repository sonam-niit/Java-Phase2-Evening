import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { User } from './user.model';

@Injectable({
  providedIn: 'root'
})
export class UserService {

  constructor(private http: HttpClient) { }

  baseUrl:string= "https://jsonplaceholder.typicode.com/users";
  getAllUsers(): Observable<User[]>{
      return this.http.get<User[]>(this.baseUrl);
  }

  getUserById(id:number): Observable<User>{
    return this.http.get<User>(this.baseUrl+"/"+id);
  }
}
