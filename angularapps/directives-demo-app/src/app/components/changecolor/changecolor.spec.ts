import { ComponentFixture, TestBed } from '@angular/core/testing';

import { Changecolor } from './changecolor';

describe('Changecolor', () => {
  let component: Changecolor;
  let fixture: ComponentFixture<Changecolor>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [Changecolor]
    })
    .compileComponents();

    fixture = TestBed.createComponent(Changecolor);
    component = fixture.componentInstance;
    await fixture.whenStable();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
