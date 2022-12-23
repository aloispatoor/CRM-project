import { Component, ViewEncapsulation } from '@angular/core';

@Component({
  selector: 'app-ui',
  templateUrl: './ui.component.html',
  styleUrls: ['./ui.component.scss'],
})
export class UiComponent {
  // Si pas de valeur par défaut = open!: boolean;
  public open: boolean = true;

  public toggle() {
    this.open = !this.open;
  }
}
