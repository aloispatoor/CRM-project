import { Component } from '@angular/core';
import { Router } from '@angular/router';
import { BehaviorSubject, Observable } from 'rxjs';
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
  public collection$: BehaviorSubject<Order[]>;
  public states = Object.values(StateOrder);

  constructor(private service: OrdersService, private router: Router){
    this.collection$ = this.service.collection$;
    this.headers = [
      'Actions',
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

  public goToEdit(id: number){
    this.router.navigate(['orders', 'edit', id]);
  }

  public deleteOrder(id: number){
    this.service.delete(id).subscribe();
  }
}
