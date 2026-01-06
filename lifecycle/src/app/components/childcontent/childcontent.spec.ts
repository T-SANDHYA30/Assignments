import { ComponentFixture, TestBed } from '@angular/core/testing';

import { Childcontent } from './childcontent';

describe('Childcontent', () => {
  let component: Childcontent;
  let fixture: ComponentFixture<Childcontent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [Childcontent]
    })
    .compileComponents();

    fixture = TestBed.createComponent(Childcontent);
    component = fixture.componentInstance;
    await fixture.whenStable();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
