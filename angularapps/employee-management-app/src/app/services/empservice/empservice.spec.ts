import { ComponentFixture, TestBed } from '@angular/core/testing';

import { Empservice } from './empservice';

describe('Empservice', () => {
  let component: Empservice;
  let fixture: ComponentFixture<Empservice>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [Empservice]
    })
    .compileComponents();

    fixture = TestBed.createComponent(Empservice);
    component = fixture.componentInstance;
    await fixture.whenStable();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
