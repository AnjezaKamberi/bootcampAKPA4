package bootcampAKPA4.seanca7;

public class Kursi {

	// private String studentet = "Antoneta, Suada";

	private String studenti1;
	private String studenti2;
	private String studenti3;
	private String studenti4;
	// ...
	private String studenti12;

	private static String[] studentet;

	public static void main(String[] args) {

		// inicializim studente
		studentet = new String[12];

		// studenti i pare
		System.out.println("Studenti i pare eshte " + studentet[0]);

		// studenti i dhjete
		System.out.println("Studenti i dhjete eshte " + studentet[9]);

		// modifikimi i vleres se nje elementi

		studentet[0] = "Antoneta";
		System.out.println("Studenti i pare (pas modifikimit )eshte " + studentet[0]);

		int[] nota = { 4, 4, 5, 4, 5, 4, 5, 4, 5 };

		// gjatesia/nr i elementeve te arrayt

		System.out.println("Ne total kam " + nota.length + " nota!");

		nota[5] = 9;
		nota[5] = 10;
		System.out.println("Nota e gjashte eshte " + nota[5]);

	}

	private static void printoNota() {
		int[] nota = { 9, 8, 10, 7, 5, 4, 5, 8, 5 };

		System.out.println("nota: " + nota[0]);
		System.out.println("nota: " + nota[1]);
		System.out.println("nota: " + nota[2]);
		System.out.println("nota: " + nota[3]);
		System.out.println("nota: " + nota[4]);

		for (int student = 0; student < nota.length; student++) {
			System.out.println("nota: " + nota[student]);
		}
	}
}
