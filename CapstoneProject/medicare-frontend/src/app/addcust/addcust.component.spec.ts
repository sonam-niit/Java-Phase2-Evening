import { ComponentFixture, TestBed } from '@angular/core/testing';

import { AddcustComponent } from './addcust.component';

describe('AddcustComponent', () => {
  let component: AddcustComponent;
  let fixture: ComponentFixture<AddcustComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ AddcustComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(AddcustComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
