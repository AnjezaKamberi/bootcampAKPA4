package bootcampAKPA4.seanca10;

public class Main {

	// deklarimi i nje objekti Student
	static Student antonetaStudent;

	public static void main(String[] args) {
		/*
		 * System.out.println("Studenti Antoneta ka keto te dhena " + antonetaStudent);
		 * // System.out.println("PARA KRIJIMIT TE OBJEKTIT");
		 * 
		 * // lexim i karakteristikave te nje objekti //
		 * System.out.println("Emri i objektit 'antonetaStudent' " + //
		 * antonetaStudent.emri); //
		 * System.out.println("Mbiemri i objektit 'antonetaStudent' " + //
		 * antonetaStudent.mbiemri);
		 * 
		 * // krijimi i nje objekti Student antonetaStudent = new Student();
		 * System.out.println("PAS KRIJIMIT TE OBJEKTIT");
		 * System.out.println("Emri i objektit 'antonetaStudent' " +
		 * antonetaStudent.emri);
		 * System.out.println("Mbiemri i objektit 'antonetaStudent' " +
		 * antonetaStudent.mbiemri);
		 * 
		 * // modifikimi i karakteristikave te nje objekti
		 * System.out.println("Adresa email para vleredhenies eshte " +
		 * antonetaStudent.emaili); antonetaStudent.emaili = "antonetagjana@gmail.com";
		 * System.out.println("Adresa email pas vleredhenies eshte " +
		 * antonetaStudent.emaili);
		 * 
		 * System.out.println("DO KRYEJ NJE VEPRIM"); // kryej nje veprim me ane te nje
		 * objekti antonetaStudent.regjistrohuNeKurs();
		 * 
		 * // krijoj objekt te ri Student armelaStudent = new Student();
		 * 
		 * armelaStudent.emri = "Armela";
		 * System.out.println("Emri i objektit 'armelaStudent' eshte " +
		 * armelaStudent.emri); System.out.println("Emri i objektit 'antonetaStudent' "
		 * + antonetaStudent.emri);
		 * 
		 * armelaStudent.kursi = ".NET";
		 * System.out.println("Kursi qe ndjek objekti 'armelaStudent' eshte " +
		 * armelaStudent.kursi);
		 * System.out.println("Kursi qe ndjek objekti 'antonetaStudent' eshte " +
		 * antonetaStudent.kursi);
		 * 
		 * Student armelaStudent2 = armelaStudent;
		 */

		// RRESHTI MEPOSHTE HEDH NJE ERROR KOMPILIMI
		// antonetaStudent = new Student();

		// RRESHTI MEPOSHTE ESHTE NE RREGULL
		antonetaStudent = new Student("", "", (short) 0, "");

		// krijoj nje objekt Student duke perdorur konstruktorin ME ARGS

		Student floresitaStudent = new Student("Floresita", "X", (short) 20, "floresitaX@gmail.com");
		System.out.println("Emri objekti 'floresitaStudent': " + floresitaStudent.emri);
		System.out.println("Mbiemri objekti 'floresitaStudent': " + floresitaStudent.mbiemri);
	}
}
