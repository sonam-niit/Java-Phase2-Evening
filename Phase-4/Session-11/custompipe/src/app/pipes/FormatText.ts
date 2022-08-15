import { Pipe, PipeTransform } from "@angular/core";

@Pipe({
    name:'changespace'
})
export class FormatText implements PipeTransform{

    transform(data: string, character:string) {
        return data.split(character).join("@");
    }

}