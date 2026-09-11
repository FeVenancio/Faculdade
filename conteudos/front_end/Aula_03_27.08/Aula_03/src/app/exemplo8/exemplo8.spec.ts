import { ComponentFixture, TestBed } from '@angular/core/testing';
import { Exemplo8 } from './exemplo8';

describe('Exemplo8', () => {
  let component: Exemplo8;
  let fixture: ComponentFixture<Exemplo8>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [Exemplo8],
    }).compileComponents();

    fixture = TestBed.createComponent(Exemplo8);
    component = fixture.componentInstance;
    await fixture.whenStable();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
