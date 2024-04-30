package bootcampAKPA4.seanca10.kompozimi.one_to_one;

import java.time.LocalDate;
import java.time.Month;

public class Main {

	public static void main(String[] args) {

		// Autor
		Autor autor = new Autor();
		autor.setEmer("Ismail");
		autor.setMbiemer("Kadare");
		autor.setDatelindja(LocalDate.of(1967, 01, 01));

		Autor autor2 = new Autor();
		autor2.setEmer("Dritero");
		autor2.setMbiemer("Agolli");
		autor2.setDatelindja(LocalDate.of(1934, Month.APRIL, 25));

		Liber liber = new Liber();
		liber.setTitull("Keshtjella");
		liber.setShtepiBotuese("Pegi");
		liber.setAutor(autor);

		System.out.println("Titulli i librit " + liber.getTitull());
		System.out.println("Autori i librit " + autor.getEmer());
		System.out.println("Autori i librit " + autor2.getEmer());
		System.out.println("*************************************");
		System.out.println("Do printoj te dhenat e librit");
		// printoTeDhenaLiber(liber);
		System.out.println("Libri ka keto te dhena \n" + liber.toString());
	}

	// e ngjashme me metoden toString()
	private static void printoTeDhenaLiber(Liber liber) {
		System.out.println("Titull libri " + liber.getTitull());
		System.out.println("Shtepi botuese " + liber.getShtepiBotuese());
		Autor autor = liber.getAutor();
		System.out.println("Autori i librit " + autor.getEmer() + " " + autor.getMbiemer());

	}
}
