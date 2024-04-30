package bootcampAKPA4.seanca10.trashegimia;

// klase jo e modifikueshme
public final class Kurs {

	private String emri;
	private int numerStudent;

	public Kurs(String emri, int numerStudent) {
		super();
		this.emri = emri;
		this.numerStudent = numerStudent;
	}

	public String getEmri() {
		return emri;
	}

	public void setEmri(String emri) {
		this.emri = emri;
	}

	public int getNumerStudent() {
		return numerStudent;
	}

	public void setNumerStudent(int numerStudent) {
		this.numerStudent = numerStudent;
	}

}
