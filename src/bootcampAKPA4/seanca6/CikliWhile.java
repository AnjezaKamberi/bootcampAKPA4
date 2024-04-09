package bootcampAKPA4.seanca6;

import java.util.Scanner;

public class CikliWhile {
	static Scanner scanner = new Scanner(System.in);
	static final int NR_TENTATIVA = 5;

	public static void main(String[] args) {
		gjejPasswordin("12345");

	}

	public static void gjejPasswordinMeJumpingStatementBreak(String pass) {

		System.out.println(" Percaktoni passwordin: ");

		int nrTentimit = 0;
		while (nrTentimit < NR_TENTATIVA) {
			String password = scanner.nextLine();
			nrTentimit++;
			if (pass.equalsIgnoreCase(password)) {
				System.out.println("Pass u gjet");
				break;
			} else {
				System.out.println("Pass nuk u gjet. Provoje perseri");

			}

		}
	}

	public static void gjejPasswordin(String pass) {

		System.out.println(" Percaktoni passwordin: ");
		String inputPassword = scanner.nextLine();
		int nrTentimit = 1;
		
		while (nrTentimit < NR_TENTATIVA 
				&& (!inputPassword.equalsIgnoreCase(pass))
			  ) {

			System.out.println("Pass nuk u gjet. Provoje perseri");
			inputPassword = scanner.nextLine();
			nrTentimit++;

		}
		
		if(nrTentimit < NR_TENTATIVA) {
			System.out.println("Passwordi u gjet");
		} else {
			System.out.println("Bllokuar perkohesisht");
		}

	}
}
