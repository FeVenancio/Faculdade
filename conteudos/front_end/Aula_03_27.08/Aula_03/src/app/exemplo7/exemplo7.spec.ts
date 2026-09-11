import { ComponentFixture, TestBed } from '@angular/core/testing';
import { Exemplo7 } from './exemplo7';

describe('Exemplo7', () => {
  let component: Exemplo7;
  let fixture: ComponentFixture<Exemplo7>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [Exemplo7],
    }).compileComponents();

    fixture = TestBed.createComponent(Exemplo7);
    component = fixture.componentInstance;
    await fixture.whenStable();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
