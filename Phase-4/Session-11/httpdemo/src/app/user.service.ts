import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { User } from './model/user.model';

@Injectable({
  providedIn: 'root'
})
export class UserService {

  constructor(private http:HttpClient) { }

  baseUrl:string="http://localhost:8082/api/users";

  getAllUsers():Observable<User[]>{
    return this.http.get<User[]>(this.baseUrl)
  }
  getUserById(id:number):Observable<User>{
    return this.http.get<User>(this.baseUrl+"/"+id)
  }
  addUser(user:User){
    return this.http.post(this.baseUrl,user);
  }
  deleteUserById(id:number){
      return this.http.delete(this.baseUrl+"/"+id);
  }
  editUser(user:User,id:number){
    return this.http.put(this.baseUrl+"/"+id,user);
  }
}
