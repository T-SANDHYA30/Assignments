import { ComponentFixture, TestBed } from '@angular/core/testing';

import { Lc } from './lc';

describe('Lc', () => {
  let component: Lc;
  let fixture: ComponentFixture<Lc>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [Lc]
    })
    .compileComponents();

    fixture = TestBed.createComponent(Lc);
    component = fixture.componentInstance;
    await fixture.whenStable();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
