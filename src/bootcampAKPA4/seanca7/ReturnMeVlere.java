package bootcampAKPA4.seanca7;

public class ReturnMeVlere {

	public static void main(String[] args) {

		System.out.println("FILLON  EKZEKUTIMI");
		System.out.println("Nota me te cilen jeni vleresuar eshte " + merrNotePerPike(50));
		System.out.println("PERFUNDON EKZEKUTIMI");

	}

	private static int merrNotePerPike(int pike) {
		System.out.println("Fillon vleresimi i studentit");
		
		if (pike < 35) {
			return 5;
		} else if (pike >= 35 && pike < 70) {
			return 8;
		} else if (pike >= 70 && pike <= 100) {
			return 10;
		} /*else {
			return 0;
		}*/
		 System.out.println("Perfundon vlresimi i studentit");
		 return 0;
	}
	
	
}






