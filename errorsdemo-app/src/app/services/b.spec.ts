import { TestBed } from '@angular/core/testing';

import { B } from './b';

describe('B', () => {
  let service: B;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(B);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
