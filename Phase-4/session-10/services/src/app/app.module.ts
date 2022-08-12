import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { ColorChangeDirective } from './ColorChange';
import { MyColor } from './mycolor';
import { ProductService } from './product.service';
import { UserService } from './user.service';
import { SwitchdemoComponent } from './switchdemo/switchdemo.component';
import { FormsModule } from '@angular/forms';

@NgModule({
  declarations: [
    AppComponent,
    ColorChangeDirective,
    MyColor,
    SwitchdemoComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule
  ],
  providers: [UserService],
  bootstrap: [AppComponent]
})
export class AppModule { }
