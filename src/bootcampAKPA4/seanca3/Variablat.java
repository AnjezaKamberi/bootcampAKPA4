package bootcampAKPA4.seanca3;

public class Variablat {

	// variabla instance
	public String ngjyraPreferuar; // access modifier public
	boolean eshteDitePushimi; // access modifier package private (default)
	private char gjinia; // vlera te mundshme F ose M access modifier private
	protected static int mosha; // access modifier protected
	// VARIABEL KONSTANT
	private static final String NID_PERSON = "AB12345K";

	public static void main(String[] args) {

		System.out.println("Prezantimi me VARIABLAT");

		// deklarimi i nje variabli
		int numer;
		double paga;
		boolean bieShi;
		char inicialEmri;
		String emri;

		// deklarim dhe inicializimi i variablave
		String mbiemri = "Tola";

		// incilizim per nje variabel te deklaruar
		numer = 10;
		paga = 2000.25;
		bieShi = true; // bieShi = false;
		inicialEmri = 'R';
		emri = "Rita";

		// deklarim i nje variabli inline

		/*
		 * String kursi; String adresa;
		 */

		String kursi, adresa, emerStudent;

		// vleredhenie inline
		/*
		 * int koordinataX = 5; int koordinataY = 10;
		 */
		// deklarim dhe vleredhenie e gabuar
		// int koordinataX = 5, koordinataY = 10, modeli = "TEST";

		// deklarim dhe vleredhenie e sakte
		int koordinataX = 5, koordinataY = 10;

		String modeli = "1234";

		System.out.println("Emri i personit eshte " + emri);
		System.out.println("Iniciali i personit eshte " + inicialEmri);
		System.out.println("Paga e personit(para modifikimit) eshte " + paga);
		System.out.println("Do bie shi sot? " + bieShi);

		paga = 3000;
		System.out.println("Paga e personit(pas modifikimit) eshte " + paga);

		// inicializim variabli
		// emerStudent = "Rita";
		emri = "Tea";
		emerStudent = emri;
		System.out.println("Emri i studentit qe ndjek kursin eshte " + emerStudent);

		emri = "Dario";
		System.out.println("Emri i studentit pas modifikimit te emrit te personit eshte " + emerStudent);

		double pagaPerditesuar;
		pagaPerditesuar = paga + 200;

		// modifikim i variablit paga duke shtuar 100
		paga = paga + 100; // paga = 3000 + 100 = 3100
		paga += 100;

		double bonusPaga = 400;
		paga += bonusPaga;
		paga = paga + bonusPaga;

		// leximi i vleres se nje varibali lokal te painicializuar
		int numriStudent;
		// System.out.println("Numri i studenteve eshte " + numriStudent);

		// leximi i vleres se nje vairbali instance te painicializuar
		System.out.println("Mosha e personit eshte " + mosha);

		// modifikim i variablit konstant
		// NID_PERSON = "XY12345P";

		// deklarimi i nje variabli lokal me vlere te pandryshueshme
		final int numri = 8;
		// numri = 10;

		// cast (konvertimi i tipit te te dhenave)
		byte moshaRe = (byte) mosha;

	}

}
