import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { UserlistComponent } from './userlist/userlist.component';

const routes: Routes = [
  {path:"list",component:UserlistComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
