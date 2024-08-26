import { Component, OnInit } from '@angular/core';
import { PlatformService } from './service/platform.service';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.scss']
})
export class AppComponent implements OnInit {


  constructor(private readonly _platformService: PlatformService){}

  ngOnInit(): void {
    this._platformService.getPlatforms().subscribe((platform) => {
      console.log(platform);
    })
  }
  
}
