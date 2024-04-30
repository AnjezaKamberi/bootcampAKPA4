package bootcampAKPA4.seanca10.trashegimia;

public class Fugon extends MjetTransporti {

	private int numriVendeve;

	public Fugon() {
		super("jeshile", "AS1234F");// sakte
		// MjetTransporti("jeshile", "AS1234F") eshte gabuar
	}

	public Fugon(String targa, String ngjyra) {
		super(targa, ngjyra);
	}

	public Fugon(String targa, String ngjyra, int numriVendeve) {
		// super(targa, ngjyra);
		this(targa, ngjyra);
		// this();
		this.numriVendeve = numriVendeve;
	}

	public int getNumriVendeve() {
		return numriVendeve;
	}

	public void setNumriVendeve(int numriVendeve) {
		this.numriVendeve = numriVendeve;
	}

}
