import { Component, OnInit } from '@angular/core';
import { PlatformService } from './services/platform.service';
import { GenresService } from './services/genres.service';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.scss']
})
export class AppComponent implements OnInit {


  constructor(
    private readonly _platformService: PlatformService,
    private readonly _genresService: GenresService,
  ){}

  ngOnInit(): void {
    this._platformService.getPlatforms().subscribe((platforms) => {
      console.log('getPlatforms', platforms);
    })

    this._genresService.getGenres().subscribe((genres) => {
      console.log('getGenres', genres )
    })
  }
  
}
