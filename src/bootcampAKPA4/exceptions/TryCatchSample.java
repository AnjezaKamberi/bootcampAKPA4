package bootcampAKPA4.exceptions;

public class TryCatchSample {

	public static void main(String[] args) {

		/*
		 * System.out.println("Do kryej disa veprime matematikore"); try {
		 * ExceptionSamples.gjeneroArithmeticException(5, 5);
		 * ExceptionSamples.gjeneroArithmeticException(5, 0);
		 * ExceptionSamples.gjeneroArithmeticException(2, 2); } catch
		 * (ArithmeticException exception) {
		 * System.out.println("Kujdes! Nuk lejohet pjesetimi me 0"); }
		 * 
		 * System.out.println("Perfundova me veprimet matematikore");
		 */
		System.out.println("Do kryej disa veprime matematikore");
		menaxhoArithmeticException(5, 5);
		menaxhoArithmeticException(5, 0);
		menaxhoArithmeticException(2, 2);
		System.out.println("Perfundova me veprimet matematikore");
	}

	private static void menaxhoArithmeticException(int numri1, int numri2) {
		try {
			ExceptionSamples.gjeneroArithmeticException(numri1, numri2);
		} 
		
		/* HIDHET ERROR
		 * catch (NullPointerException exception) {
			System.out.println("Kujdes! Nuk lejohet pjesetimi me 0");
		}*/
		/*
		 * ESHTE OK
		catch (Exception exception) {
			System.out.println("Kujdes! Nuk lejohet pjesetimi me 0");
		}*/
		catch (ArithmeticException exception) {
			System.out.println("Kujdes! Nuk lejohet pjesetimi me 0");
		}

	}
}
