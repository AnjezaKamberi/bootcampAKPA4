package bootcampAKPA4.seanca10;

import java.util.Arrays;
import java.util.Objects;

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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Arrays.hashCode(nota);
		result = prime * result + Objects.hash(emaili, emri, mbiemri, mosha);
		return result;
	}

	/*
	 * Implementimi i metodes equals
	 * 
	 * @Override public boolean equals(Object obj) { if (this == obj) return true;
	 * if (obj == null) return false; if (getClass() != obj.getClass()) return
	 * false; Student other = (Student) obj; return Objects.equals(emaili,
	 * other.emaili) && Objects.equals(emri, other.emri) && Objects.equals(mbiemri,
	 * other.mbiemri) && mosha == other.mosha && Arrays.equals(nota, other.nota); }
	 */

	@Override
	public boolean equals(Object obj) {

		Student s = (Student) obj;

		if (this.emri.equals(s.emri) && this.mbiemri.equals(s.mbiemri)) {
			return true;
		} else {
			return false;
		}
	}
}
