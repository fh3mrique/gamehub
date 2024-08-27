import { HttpClient } from "@angular/common/http";
import { Injectable } from "@angular/core";
import { BASE_URL } from "../enviroments/base-url";
import { Observable } from "rxjs";
import { PlatformsResponse } from "../interfaces/platforms-response/platforms-response.interface";

@Injectable({
    providedIn: "root"
})
export class PlatformService {

    constructor(private readonly _httpClient: HttpClient) { }

    getPlatforms(): Observable<PlatformsResponse> {
        return this._httpClient.get<PlatformsResponse>(`${BASE_URL}/platforms`)
    }
}