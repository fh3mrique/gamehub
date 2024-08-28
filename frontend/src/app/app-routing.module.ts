import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { GamesListPageComponent } from './pages/games-list-page/games-list-page.component';

const routes: Routes = [
  {path: '', component: GamesListPageComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
