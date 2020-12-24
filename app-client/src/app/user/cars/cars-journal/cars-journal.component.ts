import { Component, OnInit } from '@angular/core';
import { Observable } from "rxjs";
import { Car } from "../../models/car.model";
import { CarsMainService } from "../cars-main.service";

@Component({
  selector: 'app-cars-journal',
  templateUrl: './cars-journal.component.html',
  styleUrls: ['./cars-journal.component.css']
})
export class CarsJournalComponent implements OnInit {

  cars$: Observable<Car[]>;

  constructor(private service: CarsMainService) {
  }

  ngOnInit(): void {
    this.cars$ = this.service.cars$;
  }

}
