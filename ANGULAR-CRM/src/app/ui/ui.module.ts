import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { UiComponent } from './ui/ui.component';
import { CoreModule } from '../core/core.module';
import { Ui2Component } from './ui2/ui2.component';

@NgModule({
  declarations: [UiComponent, Ui2Component],
  imports: [CommonModule],
  exports: [UiComponent, Ui2Component],
})
export class UiModule {}
