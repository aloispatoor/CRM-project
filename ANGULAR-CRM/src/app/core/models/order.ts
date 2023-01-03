import { StateOrder } from "../enums/state-order";
import { OrderI } from "../interfaces/order-i";

export class Order implements OrderI {
  unitPrice = 500;
  nbDays = 5;
  vat = 20;
  state = StateOrder.OPTION;
  prestaType!: string;
  client!: string;
  comment!: string;
  id!: number;

  constructor(obj?: Partial<Order>){
    if(obj){
      Object.assign(this, obj);
    }
  }

}
