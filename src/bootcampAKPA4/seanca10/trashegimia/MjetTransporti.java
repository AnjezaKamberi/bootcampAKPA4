package bootcampAKPA4.seanca10.trashegimia;

public class MjetTransporti extends Object {

	private String targa;
	private String ngjyra;

	public MjetTransporti() {

	}

	public MjetTransporti(String targa, String ngjyra) {
		this.targa = targa;
		this.ngjyra = ngjyra;
	}

	public String getTarga() {
		return this.targa;
	}

	public void setTarga(String targa) {
		this.targa = targa;
	}

	public String getNgjyra() {
		return ngjyra;
	}

	public void setNgjyra(String ngjyra) {
		this.ngjyra = ngjyra;
	}

	public void ndizMjetTransporti() {
		System.out.println("Mjeti transportit u ndez");
	}

}
