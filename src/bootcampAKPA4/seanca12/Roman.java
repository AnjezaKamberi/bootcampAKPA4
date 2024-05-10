package bootcampAKPA4.seanca12;

import java.util.List;

public class Roman extends Liber {

	private List<String> kapituj;

	public Roman(String isbn, String titull, List<String> kapituj) {
		super(isbn, titull);
		this.kapituj = kapituj;
	}

	public List<String> getKapituj() {
		return kapituj;
	}

	public void setKapituj(List<String> kapituj) {
		this.kapituj = kapituj;
	}

}
