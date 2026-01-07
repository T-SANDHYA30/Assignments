import { ComponentFixture, TestBed } from '@angular/core/testing';

import { Errorscomponent } from './errorscomponent';

describe('Errorscomponent', () => {
  let component: Errorscomponent;
  let fixture: ComponentFixture<Errorscomponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [Errorscomponent]
    })
    .compileComponents();

    fixture = TestBed.createComponent(Errorscomponent);
    component = fixture.componentInstance;
    await fixture.whenStable();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
