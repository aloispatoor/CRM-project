import { Component } from '@angular/core';
import { IconDefinition } from '@fortawesome/fontawesome-svg-core';
import { faBars } from '@fortawesome/free-solid-svg-icons';

@Component({
  selector: 'app-icon-nav',
  templateUrl: './icon-nav.component.html',
  styleUrls: ['./icon-nav.component.scss']
})
export class IconNavComponent {
  public myIcon: IconDefinition;

  constructor(){
    this.myIcon = faBars;
  }
}
