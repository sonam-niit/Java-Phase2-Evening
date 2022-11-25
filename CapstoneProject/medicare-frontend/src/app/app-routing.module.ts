import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { AddcustComponent } from './addcust/addcust.component';
import { CustdetailsComponent } from './custdetails/custdetails.component';
import { CustlistComponent } from './custlist/custlist.component';
import { EditcustComponent } from './editcust/editcust.component';

const routes: Routes = [
  {path:"list",component:CustlistComponent},
  {path:"addcust",component:AddcustComponent},
  {path:'details/:id',component:CustdetailsComponent},
  {path:'edit/:id',component:EditcustComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
