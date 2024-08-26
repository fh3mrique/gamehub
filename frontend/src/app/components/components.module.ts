import { NgModule } from "@angular/core";
import { PipesModule } from "../pipes/pipes.module";
import { AngularMaterialModule } from "../angular-material/angular-material.module";
import { HeaderComponent } from './header/header.component';


@NgModule({
    declarations: [
    HeaderComponent
  ],
    imports: [
       PipesModule,
       AngularMaterialModule
    ],
    exports: [HeaderComponent],
})
export class ComponentsModule {

}