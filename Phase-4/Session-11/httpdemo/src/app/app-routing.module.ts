import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { AddUserComponent } from './add-user/add-user.component';
import { EdituserComponent } from './edituser/edituser.component';
import { UserDetailsComponent } from './user-details/user-details.component';
import { UserlistComponent } from './userlist/userlist.component';

const routes: Routes = [
  {path:"list",component:UserlistComponent},
  {path:"adduser",component:AddUserComponent},
  {path:"user-details/:id",component:UserDetailsComponent},
  {path:"edit/:id",component:EdituserComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
