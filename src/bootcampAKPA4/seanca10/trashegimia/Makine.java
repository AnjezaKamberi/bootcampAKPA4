package bootcampAKPA4.seanca10.trashegimia;

public class Makine extends MjetTransporti {

	private int shpejtesia;

	public Makine(String ngjyra, String targa, int shpejtesia) {
		super(targa, ngjyra);
		this.shpejtesia = shpejtesia;
	}

	public int getShpejtesia() {
		return shpejtesia;
	}

	public void setShpejtesia(int shpejtesia) {
		this.shpejtesia = shpejtesia;
	}

}
