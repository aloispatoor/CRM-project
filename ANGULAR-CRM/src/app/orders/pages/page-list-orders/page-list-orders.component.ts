import { Component } from '@angular/core';
import { Order } from 'src/app/core/models/order';
import { OrdersService } from 'src/app/core/services/orders.service';

@Component({
  selector: 'app-page-list-orders',
  templateUrl: './page-list-orders.component.html',
  styleUrls: ['./page-list-orders.component.scss']
})
export class PageListOrdersComponent {
  public headers: string[];
  public collection!: Order[];

  constructor(private service: OrdersService){
    this.headers = [
      'Type',
      'Client',
      'Jours',
      'Tjm',
      'total HT',
      'Total TTC',
      'Status',
    ];

    this.service.collection$.subscribe((data) => {
      this.collection = data;
      console.log(data);
    });
  }
}
