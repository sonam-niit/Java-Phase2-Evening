import { ComponentFixture, TestBed } from '@angular/core/testing';

import { EditcustComponent } from './editcust.component';

describe('EditcustComponent', () => {
  let component: EditcustComponent;
  let fixture: ComponentFixture<EditcustComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ EditcustComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(EditcustComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
