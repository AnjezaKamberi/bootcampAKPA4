package bootcampAKPA4.seanca6;

public class CikliFor {

	public static void main(String[] args) {

		int numer = 10;
		System.out.println("Filloj ekzekutimin e ciklit FOR");
		int shumaNrTek = 0;
		int shumaNrCift = 0;
		for (int iterator = 1; iterator < numer; iterator++) {
			if (iterator % 2 == 0) {
				shumaNrCift = shumaNrCift + iterator;
			} else {
				shumaNrTek = shumaNrTek + iterator;
			}
		}
		System.out.println("Shuma e numrave cift eshte :" + shumaNrCift);
		System.out.println("Shuma e numrave tek eshte :" + shumaNrTek);
		System.out.println("Perfundova ekzekutimin e ciklit FOR");
	}
}
