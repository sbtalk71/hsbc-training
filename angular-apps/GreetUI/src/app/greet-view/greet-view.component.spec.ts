import { ComponentFixture, TestBed } from '@angular/core/testing';

import { GreetViewComponent } from './greet-view.component';

describe('GreetViewComponent', () => {
  let component: GreetViewComponent;
  let fixture: ComponentFixture<GreetViewComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ GreetViewComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(GreetViewComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
