package bootcampAKPA4.seanca10.trashegimia;

public class Main {

	public static void main(String[] args) {

		MjetTransporti mjetTransporti = new MjetTransporti();

		mjetTransporti.setNgjyra("jeshile");
		mjetTransporti.setTarga("AB1234X");

		System.out.println("Targa e mjetit te transportit " + mjetTransporti.getTarga()
				+ " dhe ngjyra e mjetit te transportit eshte " + mjetTransporti.getNgjyra());

		Makine makine = new Makine();
		System.out.println("Targa e makines eshte " + makine.getTarga());
		makine.setTarga("AB343S");
		System.out.println("Targa e makines(pas modifikimit) eshte " + makine.getTarga());
		System.out.println("Ngjyra e makines eshte " + makine.getNgjyra());

	}
}
