package bootcampAKPA4.seanca6;

import java.util.Scanner;

public class CikliDoWhile {

	private static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		vleresoStudent();
	}

	private static void dalloCiklinWhileMeDoWhile() {
		int numer = 6;
		/*
		 * System.out.println("DO EKZEKUTOJ CIKLIN DO WHILE"); do {
		 * System.out.println("Numri: " + numer); numer = numer + 1; } while (numer <
		 * 5); System.out.println("PERFUNDOVA EKZEKUTIMIN E CIKLIT DO WHILE");
		 */

		System.out.println("DO EKZEKUTOJ CIKLIN  WHILE");
		while (numer < 5) {
			System.out.println("Numri: " + numer);
			numer = numer + 1;
		}
		System.out.println("PERFUNDOVA EKZEKUTIMIN E CIKLIT WHILE");

	}

	/**
	 * Vlersimi i studenteve derisa te vije nota e pare jo kaluese 4
	 */
	private static void vleresoStudent() {

		System.out.println("NE FILLIM TE CIKLIT DO WHILE");
		System.out.println("Nota e studentit eshte? ");
		byte nota = scanner.nextByte();
		do {
			System.out.println("Studenti kalues! Me jep noten e studentit pasardhes:");
			nota = scanner.nextByte();
		} while (nota > 4);
		System.out.println("NE FUND TE CIKLIT DO WHILE");
	}
}
