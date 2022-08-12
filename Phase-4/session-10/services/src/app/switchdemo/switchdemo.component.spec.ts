import { ComponentFixture, TestBed } from '@angular/core/testing';

import { SwitchdemoComponent } from './switchdemo.component';

describe('SwitchdemoComponent', () => {
  let component: SwitchdemoComponent;
  let fixture: ComponentFixture<SwitchdemoComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ SwitchdemoComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(SwitchdemoComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
