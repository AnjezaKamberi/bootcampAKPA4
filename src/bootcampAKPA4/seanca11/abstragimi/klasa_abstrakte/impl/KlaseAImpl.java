package bootcampAKPA4.seanca11.abstragimi.klasa_abstrakte.impl;

public class KlaseAImpl extends KlasaA {

	@Override
	public int metodaDyte() {
		return 10;
	}

	@Override
	public void metodaTrete(String parameter) {
		System.out.println("Implementim klasa child NORMALE " + parameter);
	}

	@Override
	public void metodaKater() {
		System.out.println("Metode e implementuar nga klasa child NORMALE");
		super.metodaKater();
	}

}
