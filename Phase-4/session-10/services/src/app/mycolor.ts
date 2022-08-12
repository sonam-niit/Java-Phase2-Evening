import { Directive, ElementRef, Renderer2 } from "@angular/core";

@Directive({
    selector:'[mycolor]'
})
export class MyColor{
    constructor(er:ElementRef, render:Renderer2){
        render.setStyle(er.nativeElement,'color','red')
        render.setStyle(er.nativeElement,'font-size','30px')
    }
}