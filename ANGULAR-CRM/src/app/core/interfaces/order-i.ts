import { StateOrder } from '../enums/state-order';

export interface OrderI {
  unitPrice: number;
  nbDays: number;
  vat: number;
  state: StateOrder;
  prestaType: string;
  client: string;
  comment: string;
  id: number;
}
