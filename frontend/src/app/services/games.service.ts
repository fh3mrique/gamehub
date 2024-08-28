import { HttpClient } from "@angular/common/http";
import { Injectable } from "@angular/core";
import { BASE_URL } from "../enviroments/base-url";
import { IGenreResponse } from "../interfaces/genres-response/genres-response.interface";
import { Observable } from "rxjs";

@Injectable({
    providedIn: "root"
})
export class GamesService {

    constructor(private readonly _httpClient: HttpClient){}

    getGenres(): Observable<IGenreResponse>{
        return this._httpClient.get<IGenreResponse>(`${BASE_URL}/genres`)
    }
}