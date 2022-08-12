import { ComponentFixture, TestBed } from '@angular/core/testing';

import { CasepipeComponent } from './casepipe.component';

describe('CasepipeComponent', () => {
  let component: CasepipeComponent;
  let fixture: ComponentFixture<CasepipeComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ CasepipeComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(CasepipeComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
