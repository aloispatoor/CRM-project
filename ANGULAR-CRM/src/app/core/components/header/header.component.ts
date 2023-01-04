import { Component } from '@angular/core';
import { VersionService } from '../../services/version.service';

@Component({
  selector: 'app-header',
  templateUrl: './header.component.html',
  styleUrls: ['./header.component.scss']
})
export class HeaderComponent {
  version!: number;

  constructor(private service: VersionService){
    this.service.version$.subscribe((data) => {
      this.version = data;
    });
  }
}
