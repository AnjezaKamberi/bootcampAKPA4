package bootcampAKPA4.seanca10.kompozimi.one_to_many;

public class Main {

	public static void main(String[] args) {

		Student student1 = new Student("Antoneta", "Gjana");
		Student student2 = new Student("Suada", "Elezaj");

		Student[] studente = new Student[2];
		studente[0] = student1;
		studente[1] = student2;

		Kurs kurs = new Kurs();
		kurs.setEmri("JAVA Bootcamp");
		kurs.setStudente(studente);

		printoTeDhenaKurs(kurs);

	}

	private static void printoTeDhenaKurs(Kurs kurs) {
		System.out.println("Kursi qe po ndiqet eshte " + kurs.getEmri());

		if (kurs.getStudente() != null && kurs.getStudente().length != 0) {
			Student[] studentet = kurs.getStudente();
			for (Student student : studentet) {
				System.out.println("Studenti i regjistruar eshte " + student.getEmri() + " " + student.getMbiemri());
			}
		}
	}
}
