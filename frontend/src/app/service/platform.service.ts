import { HttpClient } from "@angular/common/http";
import { Injectable } from "@angular/core";

@Injectable({
    providedIn: "root"
})
export class PlatformService {

    constructor(private readonly _httpClient: HttpClient) { }

    getPlatforms() {
        return this._httpClient.get('http://localhost:8080/platform');
    }
}