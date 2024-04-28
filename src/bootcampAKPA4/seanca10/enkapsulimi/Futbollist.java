package bootcampAKPA4.seanca10.enkapsulimi;

public class Futbollist {

	private String emri;
	private String mbiemri;
	private int numri;
	private String pozicioniLojes;
	private boolean zevendesues;

	private Futbollist() {

	}

	public Futbollist(String emri, String mbiemri, int numri, String pozicioniLojes) {
		this.emri = emri;
		this.mbiemri = mbiemri;
		this.numri = numri;
		this.pozicioniLojes = pozicioniLojes;
	}

	// leximi i te dhenave
	public String merrEmer() {
		return this.emri;
	}

	public String getEmri() {
		return this.emri;
	}

	// modifikimi i te dhenave

	public void ndryshoEmer(String emri) {
		this.emri = emri;
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

	public int getNumri() {
		return numri;
	}

	public void setNumri(int numri) {
		this.numri = numri;
	}

	public String getPozicioniLojes() {
		return pozicioniLojes;
	}

	public void setPozicioniLojes(String pozicioniLojes) {
		this.pozicioniLojes = pozicioniLojes;
	}

	public boolean isZevendesues() {
		return zevendesues;
	}

	public void setZevendesues(boolean zevendesues) {
		this.zevendesues = zevendesues;
	}

}
