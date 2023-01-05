import { Component, Input, OnChanges, OnInit } from '@angular/core';

@Component({
  selector: 'app-table-light',
  templateUrl: './table-light.component.html',
  styleUrls: ['./table-light.component.scss']
})
export class TableLightComponent implements OnChanges, OnInit {
  @Input() public headers!: string[];
  @Input() public collection!: any;

  constructor(){

  }

  ngOnChanges(): void {

  }

  ngOnInit(): void {

  }
}
