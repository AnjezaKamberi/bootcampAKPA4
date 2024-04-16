package bootcampAKPA4.seanca7;

import java.util.Scanner;

public class BreakJumpingStatement {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("FILLON  EKZEKUTIMI");

		int shumaNumrave = 0;
		int countNrInput = 0;
		
		while (true) {
			System.out.println("Me jep nje numer: ");
			int nr = scanner.nextInt();
			if (nr < 0) {
				break;
			} else {
				countNrInput++;
				shumaNumrave += nr; // shumaNumrave = shumaNumrave + nr;
			}
		}
		
		System.out
				.println("Ju keni dhene " + countNrInput + " numra pozitive dhe shuma rezultat "
						+ "e tyre" + " eshte " + shumaNumrave);

		System.out.println("PERFUNDON EKZEKUTIMI");

	}

}
