package bootcampAKPA4.seanca5;

import java.util.Scanner;

public class StrukturaKontrolli {
	private static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		// vleresoInputNumerik();
		// parashikoMotin();
		double cmimiPasAplikimitTeBonusit = percaktoPageseTotaleKurs(1000);
		System.out.println("Cmimi per t u paguar nga ju eshte " + cmimiPasAplikimitTeBonusit);
	}

	// ilustrim struktura kontrolli if
	public static void vleresoInputNumerik() {

		int numer;
		System.out.println("Me jep nje numer: ");
		numer = scanner.nextInt();
		System.out.println("Ju keni dhene numrin " + numer);
		System.out.println("FILLIM : vleresim i numrit nese eshte CIFT");
		// vleresoj numrin nese eshte numer cift
		if (numer % 2 == 0) {
			System.out.println("Numri qe ju keni dhene eshte nje numer CIFT");
		}
		System.out.println("MBARIM : vleresim i numrit nese eshte CIFT u realizua");

	}

	// ilustrim struktura kontrolli if-else
	public static boolean parashikoMotin() {

		int temperaturaNeGrade = 10;
		boolean eshteKoheDiell;
		System.out.println("FILLIM : vleresim i motit nese eshte kohe me diell apo jo");

		if (temperaturaNeGrade < 20) {
			System.out.println("KOHA NUK PARASHIKOHET TE JETE E MIRE!");
			eshteKoheDiell = false;
			return eshteKoheDiell; // kujdes!
		} else {
			System.out.println("KOHA PARASHIKOHET TE JETE E MIRE!");
			eshteKoheDiell = true;
		}

		System.out.println("MBARIM : vleresim i motit nese eshte kohe me diell apo jo");
		return eshteKoheDiell;
		// System.out.println("mbaroi"); STATEMENT I GABUAR
	}

	// ilustrim struktura kontrolli if-else-if
	public static double percaktoPageseTotaleKurs(double cmimiTotal) {

		String statusKursant;
		double bonus = 0;
		System.out.println("Pershendetje! Mire se erdhe ne akademine IKUBINFO");
		System.out.println(
				"Te lutem me jep statusin tend: \n" + "1. I PUNESUAR \n" + "2. I PAPUNESUAR \n" + "3. STUDENT \n");

		statusKursant = scanner.nextLine();

		if (statusKursant.equalsIgnoreCase("I PUNESUAR") || statusKursant.equalsIgnoreCase("STUDENT")) {
			bonus = 50;
			System.out.println("Ju perftoni 50% ulje");
		} else if (statusKursant.equalsIgnoreCase("I PAPUNESUAR")) {
			bonus = 100;
			System.out.println("Ju perftoni 100% ulje");
		} else {
			System.out.println("Nuk aplikoj dot asnje vleresim per statusin tend");
		}

		return cmimiTotal - (cmimiTotal * (bonus / 100));
	}

	// ilustrim struktura kontrolli nested-if
	public static void vleresoShfaqje() {

		String tipShfaqje = "SERIAL"; // SERIAL || FILM
		
		if (tipShfaqje.equals("SERIAL")) {
			System.out.println("SHFAQJA ESHTE SERIAL");
			int numerSeri = 10;
			if (numerSeri < 5) {
				System.out.println("Ju keni kohe qe te shikoni " 
			+ "te gjitha serite e shfaqjes brenda dites se sotme");
			} else {
				System.out.println("Ju nuk keni kohe per te pefunduar te gjithe " 
			+ "shfaqjen");
			}

		} else if (tipShfaqje.equals("FILM")) {
			System.out.println("SHFAQJA ESHTE FILM");
			String zhanerFilmi = "KOMEDI";
			if(zhanerFilmi.equals("KOMEDI")) {
				System.out.println("Zhaneri i filmit eshte KOMEDI dhe audienca eshte "
						+ "e lire per te gjitha moshat"); 
			} else {
				System.out.println("Ju nuk mund te shikoni dot kete film nese mosha"
						+ " juaj nuk eshte > 16");
			}
		} else {
			System.out.println("NUK VLERESOJ DOT SHFAQJEN");
		}

	}

}
