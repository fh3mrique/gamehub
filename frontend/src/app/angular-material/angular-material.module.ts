import { NgModule } from "@angular/core";
import {MatButtonModule} from '@angular/material/button';
import {MatCardModule} from '@angular/material/card';

@NgModule({
    imports: [
        MatCardModule,
        MatButtonModule,
        MatCardModule
    ],
    exports: [
        MatCardModule,
        MatButtonModule,
        MatCardModule
    ]
})
export class AngularMaterialModule {

}