import { NgModule } from "@angular/core";
import { PipesModule } from "../pipes/pipes.module";
import { AngularMaterialModule } from "../angular-material/angular-material.module";
import { HeaderComponent } from './header/header.component';
import { GameCardComponent } from './game-card/game-card.component';


@NgModule({
    declarations: [
    HeaderComponent,
    GameCardComponent
  ],
    imports: [
       PipesModule,
       AngularMaterialModule
    ],
    exports: [
      HeaderComponent,
      GameCardComponent
    ],
})
export class ComponentsModule {

}