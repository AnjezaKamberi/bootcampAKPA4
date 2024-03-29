package bootcampAKPA4.seanca4;

public class OperatoriUnar {

	public static void main(String[] args) {

		// operatori NOT

		boolean eshteCift = true;

		System.out.println("Numri eshte cift " + eshteCift);

		boolean eshteTek = !eshteCift;
		System.out.println("Numri eshte tek " + eshteTek);

		int numri1 = 10;
		int numri2 = 11;

		boolean janeNumraTeBarabarte = (numri1 == numri2);
		System.out.println("Numri " + numri1 + " dhe numri " + numri2 + " jane te barbarte? " + janeNumraTeBarabarte);

		// MENYRA E PARE
		// boolean janeNumraTeNdryshem = !janeNumraTeBarabarte;
		// MENYRA E DYTE
		boolean janeNumraTeNdryshem = (numri1 != numri2);
		System.out.println("Numri " + numri1 + " dhe numri " + numri2 + " jane te ndryshem? " + janeNumraTeNdryshem);

		// inkrementimi
		int index = 10;
		// pre inkrementimi
		int indexPreInkrement = ++index;
		System.out.println("pre inkrementimi " + indexPreInkrement);
		System.out.println("index " + index);
		// post inkrementimi
		int indexPostInkrement = index++;
		System.out.println("post inkrementimi " + indexPostInkrement);
		System.out.println("index " + index);
		// dekrementimi
		// pre dekrementimi
		int indexPreDekrement = --index;
		System.out.println("pre dekrementimi " + indexPreDekrement);
		System.out.println("index " + index);
		// post dekrementimi
		int indexPostDekrement = index--;
		System.out.println("post dekrementimi " + indexPostDekrement);
		System.out.println("index " + index);
	}
}
