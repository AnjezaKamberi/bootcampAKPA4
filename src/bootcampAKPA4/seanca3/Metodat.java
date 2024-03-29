package bootcampAKPA4.seanca3;

public class Metodat {

	public static void main(String[] args) {
		System.out.println("do therras metoden me zero parametra");
		// therritja e metodes me asnje parameter
		vendosNoteProvimi();
		System.out.println("perfundoi ekzekutimi i metodes me zero parametra");

		// therritja e metodes me nje parameter
		vendosNoteProvimi(7);
		vendosNoteProvimi(8);
		vendosNoteProvimi(4);
		vendosNoteProvimi(5);

		vendosNoteProvimi(7, "Tea");

		System.out.println("DO llogaris shumen e numrit 10 me 20");
		int shuma = llogaritShumen(10, 20);
		System.out.println("Shuma e dy numrave eshte " + shuma);
	}

	// metoda me asnje parameter
	public static void vendosNoteProvimi() {
		System.out.println("DO VENDOS NOTEN E STUDENTIT ILIA");
		System.out.println("Nota e studentit eshte 10");
		System.out.println("Nota e studentit ILIA U VENDOS");
	}

	/*
	 * public static void vendosNoteProvimi9() {
	 * System.out.println("DO VENDOS NOTEN E STUDENTIT");
	 * System.out.println("Nota e studentit eshte 9");
	 * System.out.println("Nota e studentit U VENDOS"); }
	 * 
	 * public static void vendosNoteProvimi8() {
	 * System.out.println("DO VENDOS NOTEN E STUDENTIT");
	 * System.out.println("Nota e studentit eshte 8");
	 * System.out.println("Nota e studentit U VENDOS"); }
	 */

	// metoda me nje parameter

	public static void vendosNoteProvimi(int nota) {
		System.out.println("DO VENDOS NOTEN E STUDENTIT ILIA");
		System.out.println("Nota e studentit eshte " + nota);
		System.out.println("Nota e studentit ILIA U VENDOS");
	}

	// metoda me me shume se nje parameter

	public static void vendosNoteProvimi(int nota, String emriStudent) {
		System.out.println("DO VENDOS NOTEN E STUDENTIT" + emriStudent);
		System.out.println("Nota e studentit eshte " + nota);
		System.out.println("Nota e studentit" + emriStudent + " U VENDOS");
	}

	public static int llogaritShumen(int numri1, int numri2) {

		int shuma = numri1 + numri2;
		return shuma;
	}

}
