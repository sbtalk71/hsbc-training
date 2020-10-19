import { ComponentFixture, TestBed } from '@angular/core/testing';

import { HrPageComponent } from './hr-page.component';

describe('HrPageComponent', () => {
  let component: HrPageComponent;
  let fixture: ComponentFixture<HrPageComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ HrPageComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(HrPageComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
