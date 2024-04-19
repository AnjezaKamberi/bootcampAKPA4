package bootcampAKPA4.seanca8;

import java.util.Scanner;
import java.util.Arrays;

public class LlogariBankareArray {

	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		int[] llogariBankare = new int[5];
		// POPULLO LLOGARI BANKARE PER CDO PERSON
		krijoLlogariBankare(llogariBankare);
		System.out.println("Llogari bankare pas sherbimit te klienteve eshte " + Arrays.toString(llogariBankare));
		// PERSONI ME BALANCE ME TE MADHE
		balancaMadhe(llogariBankare);
		// PERSONI ME BALANCE ME TE VOGEL
		balancaVogel(llogariBankare);
		
		int balanca = 200;
		System.out.println("BALANCA PARA EKZEKUTIMIT ESHTE " + balanca);
		dyfishoBalance(balanca);
		System.out.println("BALANCA PAS EKZEKUTIMIT ESHTE " + balanca);
	}

	public static void dyfishoBalance(int balanca) {
		System.out.println("Balanca aktuale eshte " + balanca);
		balanca = balanca * 2; // balanca *= 2;
		System.out.println("Balanca e dyfishuar eshte " + balanca);
	}
	
	public static void krijoLlogariBankare(int[] banka) {

		for (int rradhaKlient = 0; rradhaKlient < banka.length; rradhaKlient++) {
			System.out.println("Vendos balancen klienti: " + (rradhaKlient + 1));
			int llogari = scanner.nextInt();
			if (llogari < 0) {
				System.out.println("Provoje perseri");
				rradhaKlient--;
				continue;
			}
			banka[rradhaKlient] = llogari;
		}
		System.out.println(Arrays.toString(banka));
	}

	public static void balancaVogel(int[] llogariBankare) {
		int balancaMin = llogariBankare[0];
		for (int balanca : llogariBankare) {
			if (balanca < balancaMin) {
				balancaMin = balanca;
			}
		}
		System.out.println("Balanca min eshte " + balancaMin);
	}

	public static void balancaMadhe(int[] llogariBankare) {
		int balancaMax = llogariBankare[0];
		for (int balanca : llogariBankare) {
			if (balanca > balancaMax) {
				balancaMax = balanca;
			}
		}
		System.out.println("Balanca max eshte " + balancaMax);
	}
}
