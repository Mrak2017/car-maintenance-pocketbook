import { TestBed } from '@angular/core/testing';

import { CarsMainService } from './cars-main.service';

describe('CarsMainService', () => {
  let service: CarsMainService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(CarsMainService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
