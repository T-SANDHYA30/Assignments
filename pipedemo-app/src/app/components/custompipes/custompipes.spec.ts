import { ComponentFixture, TestBed } from '@angular/core/testing';

import { Custompipes } from './custompipes';

describe('Custompipes', () => {
  let component: Custompipes;
  let fixture: ComponentFixture<Custompipes>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [Custompipes]
    })
    .compileComponents();

    fixture = TestBed.createComponent(Custompipes);
    component = fixture.componentInstance;
    await fixture.whenStable();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
