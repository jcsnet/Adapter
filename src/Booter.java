import integer.LiczbaCalkowita;

import big.decimal.DuzaLiczba;

public class Booter {

	public static void main(String[] args) {

		LiczbaCalkowita liczbaCalkowita = new LiczbaCalkowita(50);
		LiczbaCalkowita liczbaCalkowita2 = new LiczbaCalkowita(2);

		DuzaLiczba wynik = new DuzaLiczba(0);

		System.out.println("\nSUMA dwóch liczb ca³kowitych " + liczbaCalkowita.dajWartosc()
				+ " oraz " + liczbaCalkowita2.dajWartosc() + " wynosi : "
				+ wynik.dodaj(liczbaCalkowita, liczbaCalkowita2).dajWynik());

		DuzaLiczba duzaLiczba = new DuzaLiczba(20);
		DuzaLiczba duzaLiczba2 = new DuzaLiczba(2);

		System.out.println("SUMA dwóch du¿ych liczb " + duzaLiczba.dajWynik()
				+ " oraz " + duzaLiczba2.dajWynik() + " wynosi : "
				+ wynik.dodaj(duzaLiczba, duzaLiczba2).dajWynik());
		
		
		System.out.println("\nRÓ¯NICA dwóch liczb ca³kowitych " + liczbaCalkowita.dajWartosc()
				+ " oraz " + liczbaCalkowita2.dajWartosc() + " wynosi : "
				+ wynik.odejmi(liczbaCalkowita, liczbaCalkowita2).dajWynik());
		
		System.out.println("RÓ¯NICA dwóch du¿ych liczb " + duzaLiczba.dajWynik()
				+ " oraz " + duzaLiczba2.dajWynik() + " wynosi : "
				+ wynik.odejmij(duzaLiczba, duzaLiczba2).dajWynik());
		
		
		System.out.println("\nILOCZYN dwóch liczb ca³kowitych " + liczbaCalkowita.dajWartosc()
				+ " oraz " + liczbaCalkowita2.dajWartosc() + " wynosi : "
				+ wynik.pomnoz(liczbaCalkowita, liczbaCalkowita2).dajWynik());
		
		System.out.println("ILOCZYN dwóch du¿ych liczb " + duzaLiczba.dajWynik()
				+ " oraz " + duzaLiczba2.dajWynik() + " wynosi : "
				+ wynik.pomnoz(duzaLiczba, duzaLiczba2).dajWynik());
		
		
		System.out.println("\nILORAZ dwóch liczb ca³kowitych " + liczbaCalkowita.dajWartosc()
				+ " oraz " + liczbaCalkowita2.dajWartosc() + " wynosi : "
				+ wynik.podziel(liczbaCalkowita, liczbaCalkowita2).dajWynik());
		
		System.out.println("ILORAZ dwóch du¿ych liczb " + duzaLiczba.dajWynik()
				+ " oraz " + duzaLiczba2.dajWynik() + " wynosi : "
				+ wynik.podziel(duzaLiczba, duzaLiczba2).dajWynik());
	}

}
