package bootcampAKPA4.seanca12;

public class Poezi extends Liber {

	private String rima;

	public Poezi(String isbn, String titull, String rima) {
		super(isbn, titull);
		this.rima = rima;
	}

	public String getRima() {
		return rima;
	}

	public void setRima(String rima) {
		this.rima = rima;
	}

}
