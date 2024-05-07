package bootcampAKPA4.seanca11.abstragimi.shembull;

public class Iphone extends Telefon {

	@Override
	public void identifikohu() {
		System.out.println("FACE ID");
	}

	@Override
	public void telefono(String emer) {
		System.out.println("dy menyra");
		super.telefono(emer);
		System.out.println("SIRI");

	}
}
