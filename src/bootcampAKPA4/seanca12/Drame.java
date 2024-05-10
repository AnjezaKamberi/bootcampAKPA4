package bootcampAKPA4.seanca12;

public class Drame extends Liber {

	private int numriRole;

	public Drame(String isbn, String titull, int numriRole) {
		super(isbn, titull);
		this.numriRole = numriRole;
	}

	public int getNumriRole() {
		return numriRole;
	}

	public void setNumriRole(int numriRole) {
		this.numriRole = numriRole;
	}

}
