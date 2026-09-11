import { ComponentFixture, TestBed } from '@angular/core/testing';
import { Exemplo5 } from './exemplo5';

describe('Exemplo5', () => {
  let component: Exemplo5;
  let fixture: ComponentFixture<Exemplo5>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [Exemplo5],
    }).compileComponents();

    fixture = TestBed.createComponent(Exemplo5);
    component = fixture.componentInstance;
    await fixture.whenStable();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
