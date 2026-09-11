import { ComponentFixture, TestBed } from '@angular/core/testing';
import { Exemplo9 } from './exemplo9';

describe('Exemplo9', () => {
  let component: Exemplo9;
  let fixture: ComponentFixture<Exemplo9>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [Exemplo9],
    }).compileComponents();

    fixture = TestBed.createComponent(Exemplo9);
    component = fixture.componentInstance;
    await fixture.whenStable();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
