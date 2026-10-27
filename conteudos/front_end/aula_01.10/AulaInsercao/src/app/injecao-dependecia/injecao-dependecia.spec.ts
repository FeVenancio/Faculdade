import { ComponentFixture, TestBed } from '@angular/core/testing';
import { InjecaoDependecia } from './injecao-dependecia';

describe('InjecaoDependecia', () => {
  let component: InjecaoDependecia;
  let fixture: ComponentFixture<InjecaoDependecia>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [InjecaoDependecia]
    })
      .compileComponents();

    fixture = TestBed.createComponent(InjecaoDependecia);
    component = fixture.componentInstance;
    await fixture.whenStable();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
