package bootcampAKPA4.seanca10.kompozimi.one_to_many;

public class Student {

	private String emri;
	private String mbiemri;

	/*
	 * Kurs kurs;
	 * 
	 * public Kurs getKurs() { return kurs; }
	 * 
	 * public void setKurs(Kurs kurs) { this.kurs = kurs; }
	 */
	public Student(String emri, String mbiemri) {
		super();
		this.emri = emri;
		this.mbiemri = mbiemri;
	}

	public String getEmri() {
		return emri;
	}

	public void setEmri(String emri) {
		this.emri = emri;
	}

	public String getMbiemri() {
		return mbiemri;
	}

	public void setMbiemri(String mbiemri) {
		this.mbiemri = mbiemri;
	}

}
