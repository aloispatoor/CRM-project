import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Environment } from 'src/environment/environment';
import { StateOrder } from '../enums/state-order';
import { Order } from '../models/order';

@Injectable({
  providedIn: 'root',
})
export class OrdersService {
  private urlApi: string;
  public collection$: Observable<Order[]>;

  constructor(private httpClient: HttpClient) {
    this.urlApi = Environment.urlApi;
    this.collection$ = this.httpClient.get<Order[]>(`${this.urlApi}/orders`);
  }

  public changeState(order: Order, state: StateOrder): Observable<Order>{
    order.state = state;
    return this.update(order);
  }

  public add(order: Order): Observable<Order>{
    return this.httpClient.post<Order>(`${this.urlApi}/orders`, order);
  }

  public update(order: Order): Observable<Order>{
    return this.httpClient.put<Order>(`${this.urlApi}/orders/${order.id}`, order);
  }

  public getItemById(id: number): Observable<Order>{
    return this.httpClient.get<Order>(`${this.urlApi}/orders/${id}`);
  }

}
