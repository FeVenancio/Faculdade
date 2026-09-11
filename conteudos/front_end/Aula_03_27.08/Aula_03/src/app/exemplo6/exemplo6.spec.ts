import { ComponentFixture, TestBed } from '@angular/core/testing';
import { Exemplo6 } from './exemplo6';

describe('Exemplo6', () => {
  let component: Exemplo6;
  let fixture: ComponentFixture<Exemplo6>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [Exemplo6],
    }).compileComponents();

    fixture = TestBed.createComponent(Exemplo6);
    component = fixture.componentInstance;
    await fixture.whenStable();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
