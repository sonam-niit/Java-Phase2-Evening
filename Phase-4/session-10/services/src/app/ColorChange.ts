import { Directive, ElementRef } from "@angular/core";

@Directive({
    selector:'[colorchange]'
})
export class ColorChangeDirective{
    constructor(er:ElementRef){
        er.nativeElement.style.backgroundColor="green";
        er.nativeElement.style.color="white";
    }
}