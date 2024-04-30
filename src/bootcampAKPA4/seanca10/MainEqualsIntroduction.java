package bootcampAKPA4.seanca10;

import java.util.ArrayList;
import java.util.List;

public class MainEqualsIntroduction {

	public static void main(String[] args) {
		List<Student> studente = new ArrayList<>();

		Student studenti1 = new Student("Anto", "Gjana");
		Student studenti2 = new Student("Sua", "Elezaj");
		Student studenti3 = new Student("Anto", "Gjana");
		Student studenti4 = studenti2;

		studente.add(studenti1);
		studente.add(studenti2);
		studente.add(studenti3);
		studente.add(studenti4);

		System.out.println("numri total i studenteve eshte " + studente.size());
		
		System.out.println("PA PERDORIMIN E METODES EQUALS");

		studenteTeBarabarte(studenti1, studenti3);
		studenteTeBarabarte(studenti2, studenti4);

		System.out.println("***********************************");
		System.out.println("ME PERDORIMIN E METODES EQUALS");

		studenteTeBarabarteMeEquals(studenti1, studenti3);
		studenteTeBarabarteMeEquals(studenti2, studenti4);
	}

	private static void studenteTeBarabarte(Student student1, Student student2) {
		if (student1 == student2) {
			System.out.println("Ju jeni regjistruar nje here");
		} else {
			System.out.println("Regjistrimi juaj u pranua");
		}
	}

	private static void studenteTeBarabarteMeEquals(Student student1, Student student2) {
		if (student1.equals(student2)) {
			System.out.println("Ju jeni regjistruar nje here");
		} else {
			System.out.println("Regjistrimi juaj u pranua");
		}
	}
}
