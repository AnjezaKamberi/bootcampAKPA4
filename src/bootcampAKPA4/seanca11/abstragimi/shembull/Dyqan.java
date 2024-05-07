package bootcampAKPA4.seanca11.abstragimi.shembull;

import java.util.ArrayList;
import java.util.List;

public class Dyqan {

	public static void main(String[] args) {

		List<Object> paisje = new ArrayList<>();

		Iphone iphone11 = new Iphone();
		Nokia nokia = new Nokia();
		Samsung samsung = new Samsung();

		paisje.add(iphone11);
		paisje.add(nokia);
		paisje.add(samsung);
		
		nokia.identifikohu();
		samsung.identifikohu();
		iphone11.identifikohu();
		
		Laptop laptop = new Laptop();
		paisje.add(laptop);
		
		// instanceof
	}
}
