import { ComponentFixture, TestBed } from '@angular/core/testing';

import { Empupdate } from './empupdate';

describe('Empupdate', () => {
  let component: Empupdate;
  let fixture: ComponentFixture<Empupdate>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [Empupdate]
    })
    .compileComponents();

    fixture = TestBed.createComponent(Empupdate);
    component = fixture.componentInstance;
    await fixture.whenStable();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
