import { ComponentFixture, TestBed } from '@angular/core/testing';
import { Exemplo4 } from './exemplo4';

describe('Exemplo4', () => {
  let component: Exemplo4;
  let fixture: ComponentFixture<Exemplo4>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [Exemplo4],
    }).compileComponents();

    fixture = TestBed.createComponent(Exemplo4);
    component = fixture.componentInstance;
    await fixture.whenStable();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
