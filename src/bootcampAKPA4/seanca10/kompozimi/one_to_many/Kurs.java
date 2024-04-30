package bootcampAKPA4.seanca10.kompozimi.one_to_many;

public class Kurs {

	Student[] studente;
	private String emri;

	public Kurs() {
		studente = new Student[12];
	}

	public String getEmri() {
		return emri;
	}

	public void setEmri(String emri) {
		this.emri = emri;
	}

	public Student[] getStudente() {
		return studente;
	}

	public void setStudente(Student[] studente) {
		this.studente = studente;
	}

}
