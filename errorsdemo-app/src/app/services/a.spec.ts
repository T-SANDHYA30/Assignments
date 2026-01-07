import { TestBed } from '@angular/core/testing';

import { A } from './a';

describe('A', () => {
  let service: A;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(A);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
