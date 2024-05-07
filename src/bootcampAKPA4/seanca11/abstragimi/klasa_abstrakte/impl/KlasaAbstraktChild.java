package bootcampAKPA4.seanca11.abstragimi.klasa_abstrakte.impl;

public abstract class KlasaAbstraktChild extends KlasaA {

	@Override
	public int metodaDyte() {
		return 5;
	}

	@Override
	public void metodaKater() {
		super.metodaKater();
		System.out.print("bere override nga child-i abstrakt");
	}
}
