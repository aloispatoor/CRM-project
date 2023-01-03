import { Component } from '@angular/core';
import { OrdersService } from 'src/app/core/services/orders.service';

@Component({
  selector: 'app-page-list-orders',
  templateUrl: './page-list-orders.component.html',
  styleUrls: ['./page-list-orders.component.scss']
})
export class PageListOrdersComponent {
  constructor(private service: OrdersService){
    this.service.collection$.subscribe((data) => {
      console.log(data);
    });
  }
}
