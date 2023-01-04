import { Injectable } from '@angular/core';
import { BehaviorSubject } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class VersionService {
  version$: BehaviorSubject<number> = new BehaviorSubject<number>(0);

  constructor() {
    this.version$.subscribe();
  }

  public getVersion(){
    return this.version$;
  }

  public addVersion(){
    this.version$.next(this.version$.getValue() + 1);
    this.version$.subscribe();
  }
}
