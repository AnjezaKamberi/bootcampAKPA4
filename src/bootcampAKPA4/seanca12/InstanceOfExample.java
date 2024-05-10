package bootcampAKPA4.seanca12;

import java.util.List;

public class InstanceOfExample {

	public static void main(String[] args) {

		Roman roman = new Roman("ADFSDF", "Romani", List.of("Kapitulli 1"));
		RomanShkencor romanShkencor = new RomanShkencor("ADFSDF12", "Romani 1", List.of("Kapitulli 1"));

		Roman romanShkencor2 = new RomanShkencor("ADFSDF13", "Romani 2", List.of("Kapitulli 1"));
		// RomanShkencor romanShkencor3 = new Roman("ADFSDF", "Romani",
		// List.of("Kapitulli 1")); E GABUAR

		if (roman instanceof Roman) {
			System.out.println("Libri " + roman.getTitull() + " eshte instance e nje ROMANI");
		}

		if (roman instanceof RomanShkencor) {
			System.out.println("Libri " + roman.getTitull() + " eshte instance e nje ROMANI SHKENCOR");
		}

		if (romanShkencor instanceof Roman) {
			System.out.println("Libri me titull " + romanShkencor.getTitull() + " eshte nje instance e nje ROMANI");
		}

		if (romanShkencor instanceof RomanShkencor) {
			System.out.println(
					"Libri me titull " + romanShkencor.getTitull() + " eshte nje instance e nje ROMANI SHKENCOR");
		}

		if (romanShkencor2 instanceof Roman) {
			System.out.println("Libri me titull " + romanShkencor2.getTitull() + " eshte nje instance e nje ROMANI");
		}

		if (romanShkencor2 instanceof RomanShkencor) {
			System.out.println(
					"Libri me titull " + romanShkencor2.getTitull() + " eshte nje instance e nje ROMANI SHKENCOR");
		}

	}
}
