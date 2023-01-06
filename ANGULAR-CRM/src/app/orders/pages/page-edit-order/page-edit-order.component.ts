import { Component } from '@angular/core';
import { FormBuilder, FormGroup } from '@angular/forms';
import { Router } from '@angular/router';
import { StateOrder } from 'src/app/core/enums/state-order';
import { Order } from 'src/app/core/models/order';
import { OrdersService } from 'src/app/core/services/orders.service';

@Component({
  selector: 'app-page-edit-order',
  templateUrl: './page-edit-order.component.html',
  styleUrls: ['./page-edit-order.component.scss']
})
export class PageEditOrderComponent {
  public form!: FormGroup;
  public states!: string[];
  public order: Order;

  constructor(private formBuilder: FormBuilder, private service: OrdersService, private router: Router){
    this.states = Object.values(StateOrder);
    this.order = new Order();

    this.form = this.formBuilder.group({
      id: [this.order.id],
      prestaType: [this.order.prestaType],
      client: [this.order.client],
      nbDays: [this.order.nbDays],
      unitPrice: [this.order.unitPrice],
      vat: [this.order.vat],
      state: [this.order.state],
      comment: [this.order.comment],
    })
  }

  public onSubmit(){
    this.service.update(this.form.value).subscribe(()=> {
      this.router.navigate(['orders']);
    });
  }
}
