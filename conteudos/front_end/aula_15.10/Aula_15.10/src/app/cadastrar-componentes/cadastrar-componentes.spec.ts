import { ComponentFixture, TestBed } from '@angular/core/testing';
import { CadastrarComponentes } from './cadastrar-componentes';

describe('CadastrarComponentes', () => {
  let component: CadastrarComponentes;
  let fixture: ComponentFixture<CadastrarComponentes>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [CadastrarComponentes],
    }).compileComponents();

    fixture = TestBed.createComponent(CadastrarComponentes);
    component = fixture.componentInstance;
    await fixture.whenStable();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
