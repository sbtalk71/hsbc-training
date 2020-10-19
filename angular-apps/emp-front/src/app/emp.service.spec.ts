import { TestBed } from '@angular/core/testing';

import { EmpService } from './emp.service';

describe('EmpService', () => {
  let service: EmpService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(EmpService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
