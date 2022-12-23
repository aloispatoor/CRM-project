import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { CoreModule } from './core/core.module';
import { MediaqueriesComponent } from './cours/mediaqueries/mediaqueries.component';

@NgModule({
  declarations: [AppComponent, MediaqueriesComponent],
  imports: [BrowserModule, AppRoutingModule, CoreModule],
  providers: [],
  bootstrap: [AppComponent],
  exports: [],
})
export class AppModule {}
