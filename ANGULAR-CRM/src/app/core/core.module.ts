import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { UiModule } from '../ui/ui.module';
import { LoginModule } from '../login/login.module';
import { HeaderComponent } from './components/header/header.component';
import { FooterComponent } from './components/footer/footer.component';
import { NavComponent } from './components/nav/nav.component';
import { IconsModule } from '../icons/icons.module';

@NgModule({
  declarations: [
    HeaderComponent,
    FooterComponent,
    NavComponent
  ],
  imports: [CommonModule],
  exports: [UiModule, LoginModule, IconsModule, HeaderComponent, FooterComponent, NavComponent],
})
export class CoreModule {}
