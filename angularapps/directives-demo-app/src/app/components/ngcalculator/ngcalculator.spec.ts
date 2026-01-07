import { ComponentFixture, TestBed } from '@angular/core/testing';

import { Ngcalculator } from './ngcalculator';

describe('Ngcalculator', () => {
  let component: Ngcalculator;
  let fixture: ComponentFixture<Ngcalculator>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [Ngcalculator]
    })
    .compileComponents();

    fixture = TestBed.createComponent(Ngcalculator);
    component = fixture.componentInstance;
    await fixture.whenStable();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
