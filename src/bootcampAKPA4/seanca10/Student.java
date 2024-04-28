package bootcampAKPA4.seanca10;

public class Student {

	String emri;
	String mbiemri;
	short mosha;
	String emaili;
	static String kursi;
	int[] nota;

	// KONSTRUKTOR PA PARAMETER (NO-ARGS) - KONSTRUKTORI DEFAULT

	public Student() {
		emri = "emri";
		mbiemri = "mbiemri";
		mosha = 10;
		emaili = "@gmail.com";
		kursi = "JAVA";
		nota = new int[5];
	}

	// KONSTRUKTORI ME ARGS
	public Student(String emriStudent, String mbiemri) {
		this();
		this.emri = emriStudent;
		this.mbiemri = mbiemri;
	}

	public Student(String emri, String mbiemri, short mosha, String emaili) {
		this(emri, mbiemri);
		this.mosha = mosha;
		this.emaili = emaili;

	}

	public void regjistrohuNeKurs() {

		System.out.println("Studenti u regjistrua ne kursin " + kursi);
	}

	public void regjistrohuNeKurs(String kursi) {

		System.out.println("Studenti u regjistrua ne kursin " + kursi);
	}

	public void regjistrohuNeKurs(String kursi, double pagesa) {

		System.out.println("Studenti u regjistrua ne kursin " + kursi);
	}
	/*
	 * public void regjistrohuNeKurs(String kursi, double sezoni) {
	 * 
	 * System.out.println("Studenti u regjistrua ne kursin " + kursi); }
	 */
}
