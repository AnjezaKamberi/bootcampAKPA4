package bootcampAKPA4.seanca7;

public class SwitchIntroduction {

	public static void main(String[] args) {

		int diteJave = 15;

		System.out.println("FILLON EKZEKUTIMI I SWITCH");

		switch (diteJave) {

		case 1:
		case 10:
		case 20: 
			System.out.println("Ndeshja qe do luhet eshte: ITALI - GJERMANI");
			break;
		case 2:
			System.out.println("Ndeshja qe do luhet eshte: ITALI - SHQIPERI ");
			break;
		case 3:
			System.out.println("Ndeshja qe do luhet eshte: BARCELONA - PSG");
			break;
		case 4:
			System.out.println("Ndeshja qe do luhet eshte: REAL MADRID - MAN CITY");
			break;
		case 5:
			System.out.println("ESHTE DITE KURSI");
			//break;
		default:
			System.out.println("Eshte dite pushimi");

		}

		System.out.println("MBARON EKZEKUTIMI I SWITCHIT");
	}
}
