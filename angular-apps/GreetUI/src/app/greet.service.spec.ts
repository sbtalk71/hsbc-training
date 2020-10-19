import { TestBed } from '@angular/core/testing';

import { GreetService } from './greet.service';

describe('GreetService', () => {
  let service: GreetService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(GreetService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
