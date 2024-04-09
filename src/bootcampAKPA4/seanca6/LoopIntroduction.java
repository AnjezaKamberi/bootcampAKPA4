package bootcampAKPA4.seanca6;

public class LoopIntroduction {

	public static void main(String[] args) {
		printoNumratMeCikel();
	}

	private static void printoNumratPaCikel() {
		// printo numrat nga 1 ne 10
		System.out.println("Numri: 1");
		System.out.println("Numri: 2");
		System.out.println("Numri: 3");
		System.out.println("Numri: 4");
		System.out.println("Numri: 5");
		System.out.println("...");
		System.out.println("Numri: 10");
	}

	private static void printoNumratMeCikel() {
		int numer = 1;
		while (numer < 10) {
			System.out.println("Numri: " + numer);
			numer = numer + 1;
		}
	}
}
