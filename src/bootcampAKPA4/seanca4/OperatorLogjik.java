package bootcampAKPA4.seanca4;

public class OperatorLogjik {

	public static void main(String[] args) {

		boolean bieShi = true;
		boolean eshteMarte = true;

		// AND LOGJIK
		boolean bieShiDheEshteMarte = (bieShi && eshteMarte);
		System.out.println("Sot eshte e marte DHE sot bie shi " + bieShiDheEshteMarte);
		// OR LOGJIK
		boolean bieShiOseEshteMarte = (bieShi || eshteMarte);
		System.out.println("Sot eshte e marte OSE sot bie shi " + bieShiDheEshteMarte);

		boolean nukBieShiDheEshteMarte = (!bieShi && eshteMarte);
		System.out.println("Sot nuk bie shi dhe eshte e marte " + nukBieShiDheEshteMarte);

		boolean nukBieShiDheNukEshteMarte = (!bieShi && !eshteMarte);
		System.out.println("Sot nuk bie shi dhe nuk eshte e marte " + nukBieShiDheNukEshteMarte);

	}
}
