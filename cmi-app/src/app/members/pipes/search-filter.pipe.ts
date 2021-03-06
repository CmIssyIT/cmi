import { Injectable, Pipe, PipeTransform } from '@angular/core';

@Pipe({
  name: 'searchfilter'
})

@Injectable()
export class SearchFilterPipe implements PipeTransform {
  transform(items: any[], field?: string, value?: string): any[] {
    console.log("test SearchFilterPipe");
    if (!items) return [{value: 'test'}];
    return items.filter(it => it[field] === value);
  }
}
