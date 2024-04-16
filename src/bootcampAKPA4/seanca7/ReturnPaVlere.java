package bootcampAKPA4.seanca7;

import java.util.Scanner;

public class ReturnPaVlere {

	public static void main(String[] args) {

		System.out.println("FILLON  EKZEKUTIMI");
		lexoShitjePer10Dite();
		System.out.println("PERFUNDON EKZEKUTIMI");

	}

	private static void lexoShitjePer10Dite() {
		Scanner scanner = new Scanner(System.in);
		// lexim i shitjeve te realizuara per 10 dite nga nje shites

		for (int iteratorDite = 0; iteratorDite < 10; iteratorDite++) {
			System.out.println("Sa eshte numri i shitjeve per diten: " + (iteratorDite + 1));
			int nrShitje = scanner.nextInt();
			if (nrShitje > 100) {
				System.out.println("Dicka nuk shkon!");
				return;
			} else {
				System.out.println("vazhdo me shitjet e diteve pasardhese");
				return;
			}
		}

		System.out.println("Perfundoi leximi i shitjeve te 10 ditorit te pare");

	}
}
