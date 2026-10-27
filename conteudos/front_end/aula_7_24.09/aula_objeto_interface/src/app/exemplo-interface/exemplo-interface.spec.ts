import { ComponentFixture, TestBed } from '@angular/core/testing';
import { ExemploInterface } from './exemplo-interface';

describe('ExemploInterface', () => {
  let component: ExemploInterface;
  let fixture: ComponentFixture<ExemploInterface>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [ExemploInterface],
    }).compileComponents();

    fixture = TestBed.createComponent(ExemploInterface);
    component = fixture.componentInstance;
    await fixture.whenStable();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
