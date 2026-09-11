import { ComponentFixture, TestBed } from '@angular/core/testing';
import { Exemplo10 } from './exemplo10';

describe('Exemplo10', () => {
  let component: Exemplo10;
  let fixture: ComponentFixture<Exemplo10>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [Exemplo10],
    }).compileComponents();

    fixture = TestBed.createComponent(Exemplo10);
    component = fixture.componentInstance;
    await fixture.whenStable();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
