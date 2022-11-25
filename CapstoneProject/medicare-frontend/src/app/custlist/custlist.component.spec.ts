import { ComponentFixture, TestBed } from '@angular/core/testing';

import { CustlistComponent } from './custlist.component';

describe('CustlistComponent', () => {
  let component: CustlistComponent;
  let fixture: ComponentFixture<CustlistComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ CustlistComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(CustlistComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
