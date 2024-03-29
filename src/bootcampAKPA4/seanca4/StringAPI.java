package bootcampAKPA4.seanca4;

public class StringAPI {

	public static void main(String[] args) {
		
String tekst = "JAVA BOOTCAMP";
// numri i karaktereve te nje teksti
int gjatesiTekst = tekst.length();

System.out.println("Numri i karaktereve "
		+ "te tekstit eshte " + 
		gjatesiTekst);
// karakteri ne nje index te caktuar te nje teksti		
System.out.println("Karakteri i pare "
		+ "i tekstit eshte " + 
		tekst.charAt(0));
	}
}
