import { ComponentFixture, TestBed } from '@angular/core/testing';
import { InjecaoDependenciaProdutoCatalogo } from './injecao-dependencia-produto-catalogo';

describe('InjecaoDependenciaProdutoCatalogo', () => {
  let component: InjecaoDependenciaProdutoCatalogo;
  let fixture: ComponentFixture<InjecaoDependenciaProdutoCatalogo>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [InjecaoDependenciaProdutoCatalogo],
    }).compileComponents();

    fixture = TestBed.createComponent(InjecaoDependenciaProdutoCatalogo);
    component = fixture.componentInstance;
    await fixture.whenStable();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
