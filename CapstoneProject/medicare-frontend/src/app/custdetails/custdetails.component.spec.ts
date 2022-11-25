import { ComponentFixture, TestBed } from '@angular/core/testing';

import { CustdetailsComponent } from './custdetails.component';

describe('CustdetailsComponent', () => {
  let component: CustdetailsComponent;
  let fixture: ComponentFixture<CustdetailsComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ CustdetailsComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(CustdetailsComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
