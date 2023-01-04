import { Component, Version } from '@angular/core';
import { BehaviorSubject } from 'rxjs';
import { VersionService } from '../../services/version.service';

@Component({
  selector: 'app-nav',
  templateUrl: './nav.component.html',
  styleUrls: ['./nav.component.scss']
})
export class NavComponent {
  private version$: BehaviorSubject<number>;

  constructor(private service: VersionService){
    this.version$ = this.service.getVersion();
  }

  public addVersion(){
    this.service.addVersion();
    console.log(this.version$);
  }
}
