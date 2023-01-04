import { Component } from '@angular/core';
import { VersionService } from '../../services/version.service';

@Component({
  selector: 'app-footer',
  templateUrl: './footer.component.html',
  styleUrls: ['./footer.component.scss']
})
export class FooterComponent {
  version!: number;

  constructor(private service: VersionService){
    this.service.version$.subscribe((data) => {
      this.version = data;
    });
  }
}
