package big.decimal;

import integer.LiczbaCalkowita;

import java.math.BigDecimal;

public class DuzaLiczba {
	
	private BigDecimal bigDecimal;

	public DuzaLiczba(int number) {
		this.bigDecimal = new BigDecimal(number);
	}
	
	public DuzaLiczba dodaj(LiczbaCalkowita lc1, LiczbaCalkowita lc2){
		return new DuzaLiczba(lc1.dajWartosc()+lc2.dajWartosc());
	}
	
	public DuzaLiczba dodaj(DuzaLiczba dl1, DuzaLiczba dl2){
		return new DuzaLiczba(dl1.dajWynik()+dl2.dajWynik());
	}
	
	public DuzaLiczba podziel(LiczbaCalkowita lc1, LiczbaCalkowita lc2){
		return new DuzaLiczba(lc1.dajWartosc()/lc2.dajWartosc());
	}
	
	public DuzaLiczba podziel(DuzaLiczba dl1, DuzaLiczba dl2){
		return new DuzaLiczba(dl1.dajWynik()/dl2.dajWynik());
	}
	
	public DuzaLiczba pomnoz(LiczbaCalkowita lc1, LiczbaCalkowita lc2){
		return new DuzaLiczba(lc1.dajWartosc()*lc2.dajWartosc());
	}
	
	public DuzaLiczba pomnoz(DuzaLiczba dl1, DuzaLiczba dl2){
		return new DuzaLiczba(dl1.dajWynik()*dl2.dajWynik());
	}
	
	public DuzaLiczba odejmi(LiczbaCalkowita lc1, LiczbaCalkowita lc2){
		return new DuzaLiczba(lc1.dajWartosc()-lc2.dajWartosc());
	}
	
	public DuzaLiczba odejmij(DuzaLiczba dl1, DuzaLiczba dl2){
		return new DuzaLiczba(dl1.dajWynik()-dl2.dajWynik());
	}
	
	public int dajWynik(){
		return bigDecimal.intValue();
	}
}
