import { ComponentFixture, TestBed } from '@angular/core/testing';

import { DecimalpipeComponent } from './decimalpipe.component';

describe('DecimalpipeComponent', () => {
  let component: DecimalpipeComponent;
  let fixture: ComponentFixture<DecimalpipeComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ DecimalpipeComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(DecimalpipeComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
