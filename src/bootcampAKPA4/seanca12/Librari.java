package bootcampAKPA4.seanca12;

import java.util.ArrayList;
import java.util.List;

import bootcampAKPA4.seanca11.abstragimi.shembull.Iphone;

public class Librari {

	// me polimorfizem
	 private static List<Liber> libra;

	// pa polimorfizem
	/*
	 * private List<Roman> romane;
	 * private List<Drame> drama;
	 * private List<Poezi> poezi;
	 * 
	 * */
	 
	 public static void main(String[] args) {
		 libra = new ArrayList<>();
		 Liber liber = new Drame("ASSDDF", "Titulli Drame", 5);
		 shtoLiber(liber);
		 Liber liberRoman = new Roman("QEWRTE", "Titulli Roman", List.of("Kapitulli 1", "Kapitulli 2"));
		 //liber = new Roman("QEWRTE", "Titulli Roman", List.of("Kapitulli 1", "Kapitulli 2"));
		 shtoLiber(liberRoman);
		 shtoLiber(new Poezi("ESDFSD", "Titull Poezi", "ABAB"));
		 
		 printoLibra(libra);
		 
		 // shtoLiber(new Iphone()); E GABUAR
	 
	 }
	 
	 /**
	  * Printo titujt e librave
	  * @param libra librat per t'u printuar
	  */
	 private static void printoLibra(List<Liber> libra) {
		 
		 for(Liber liber : libra) {
			 System.out.println("Titulli i librit eshte " + liber.getTitull());
		 }
	 }
	 

	 /**
	  * Shto nje liber ne librari 
	  * @param liber libri qe do shtohet
	  */
	 private static void shtoLiber(Liber liber) {
		 if(liber.getIsbn().isEmpty()) {
			 System.out.println("Nuk mund te shtoj librin sepse nuk eshte percaktuar ISBN-ja");
			 return;
		 } 
		 libra.add(liber);
		 if(liber instanceof Roman) {
			 System.out.println("Libri u shtua eshte nje roman");
		 } else if (liber instanceof Poezi) {
			 System.out.println("Libri u shtua eshte nje poezi");
		 } else if (liber instanceof Drame) {
			 System.out.println("Libri u shtua eshte nje drame");
		 } 
		 
	 }
	 
	 

}
