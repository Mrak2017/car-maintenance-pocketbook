import { Injectable } from '@angular/core';
import { CarsService } from "../../../../build/openapi";
import { Observable } from "rxjs";
import { Car } from "../models/car.model";
import { map } from "rxjs/operators";

@Injectable({
  providedIn: 'root'
})
export class CarsMainService {

  cars$: Observable<Car[]>;

  constructor(private readonly backendService: CarsService) {

    this.cars$ = this.backendService.getCars().pipe(map(dto => Car.fromArrayDTO(dto)));
  }
}
