import { ComponentFixture, TestBed } from '@angular/core/testing';

import { CurrencypipeComponent } from './currencypipe.component';

describe('CurrencypipeComponent', () => {
  let component: CurrencypipeComponent;
  let fixture: ComponentFixture<CurrencypipeComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ CurrencypipeComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(CurrencypipeComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
