import { Component } from '@angular/core';
import { Observable } from 'rxjs';
import { StateOrder } from 'src/app/core/enums/state-order';
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
  public states = Object.values(StateOrder);

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

  public changeState(order: Order, event: Event){
    const target = event.target as HTMLSelectElement;
    const state = target.value as StateOrder;
    this.service.changeState(order, state).subscribe((data) => {
      Object.assign(order, data);
    });
  }
}
