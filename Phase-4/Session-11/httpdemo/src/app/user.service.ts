import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { User } from './model/user.model';

@Injectable({
  providedIn: 'root'
})
export class UserService {

  constructor(private http:HttpClient) { }

  baseUrl:string="http://localhost:8082/UserLogService/users";

  getAllUsers():Observable<User[]>{
    return this.http.get<User[]>(this.baseUrl)
  }
  getUserById(id:number):Observable<User>{
    return this.http.get<User>(this.baseUrl+"/"+id)
  }
}
