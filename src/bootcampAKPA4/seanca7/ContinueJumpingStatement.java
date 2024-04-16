package bootcampAKPA4.seanca7;

import java.util.Scanner;

public class ContinueJumpingStatement {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("FILLON  EKZEKUTIMI");

		for (int personaNePritje = 0; personaNePritje < 10; personaNePritje++) {
			System.out.println("Klient " + (personaNePritje + 1) + " Sa eshte shuma e te ardhurave te tua mujore?");
			double teArdhuraMujore = scanner.nextDouble();
			if (teArdhuraMujore < 1000.0) {
				System.out.println("Klient " + (personaNePritje + 1) + " nuk mund te marresh nje kredi.");
				continue;
			}
			System.out.println("Cili eshte emri juaj:");
			String emri = scanner.next();
			System.out.println("Emri i kredi kerkuesit eshte " + emri);
			System.out.println("Kredia mbyllet ne GUSHT 2027");
		}

		System.out.println("PERFUNDON EKZEKUTIMI");

	}

}
