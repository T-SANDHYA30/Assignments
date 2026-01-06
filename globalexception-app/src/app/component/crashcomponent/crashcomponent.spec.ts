import { ComponentFixture, TestBed } from '@angular/core/testing';

import { Crashcomponent } from './crashcomponent';

describe('Crashcomponent', () => {
  let component: Crashcomponent;
  let fixture: ComponentFixture<Crashcomponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [Crashcomponent]
    })
    .compileComponents();

    fixture = TestBed.createComponent(Crashcomponent);
    component = fixture.componentInstance;
    await fixture.whenStable();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
