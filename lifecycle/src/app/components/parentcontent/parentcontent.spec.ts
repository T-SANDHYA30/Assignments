import { ComponentFixture, TestBed } from '@angular/core/testing';

import { Parentcontent } from './parentcontent';

describe('Parentcontent', () => {
  let component: Parentcontent;
  let fixture: ComponentFixture<Parentcontent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [Parentcontent]
    })
    .compileComponents();

    fixture = TestBed.createComponent(Parentcontent);
    component = fixture.componentInstance;
    await fixture.whenStable();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
