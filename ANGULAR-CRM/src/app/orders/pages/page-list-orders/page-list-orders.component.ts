import { Component } from '@angular/core';
import { Observable } from 'rxjs';
import { Order } from 'src/app/core/models/order';
import { OrdersService } from 'src/app/core/services/orders.service';

@Component({
  selector: 'app-page-list-orders',
  templateUrl: './page-list-orders.component.html',
  styleUrls: ['./page-list-orders.component.scss']
})
export class PageListOrdersComponent {
  public headers: string[];
  public collection$: Observable<Order[]>;

  constructor(private service: OrdersService){
    this.collection$ = this.service.collection$;
    this.headers = [
      'Type',
      'Client',
      'Jours',
      'Tjm',
      'Total HT',
      'Total TTC',
      'Status',
    ];

  }
}
