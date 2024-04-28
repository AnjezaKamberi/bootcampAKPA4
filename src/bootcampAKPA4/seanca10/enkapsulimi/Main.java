package bootcampAKPA4.seanca10.enkapsulimi;

public class Main {

	public static void main(String[] args) {

		Futbollist ertiObjekt = new Futbollist("Erti", "X", 7, "Sulmues Majte");

		System.out.println("Emri objekti 'ertiObjekt' " + ertiObjekt.getEmri());
		System.out.println("Numri futbollist 'ertiObjekt' " + ertiObjekt.getNumri());

		ertiObjekt.setPozicioniLojes("Sulmues Djathte");

		System.out.println("Pozicioni lojes : " + ertiObjekt.getPozicioniLojes());
	}
}
