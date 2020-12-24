import { ComponentFixture, TestBed } from '@angular/core/testing';

import { CarsJournalComponent } from './cars-journal.component';

describe('CarsJournalComponent', () => {
  let component: CarsJournalComponent;
  let fixture: ComponentFixture<CarsJournalComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ CarsJournalComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(CarsJournalComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
