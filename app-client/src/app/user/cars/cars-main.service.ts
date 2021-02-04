import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { map } from 'rxjs/operators';
import { Car } from '../models/car.model';
import { CarsService } from '../../backend';

@Injectable({
  providedIn: 'root'
})
export class CarsMainService {

  cars$: Observable<Car[]>;

  constructor(private readonly backendService: CarsService) {

    this.cars$ = this.backendService.getCars().pipe(map(dto => Car.fromArrayDTO(dto)));
  }
}
