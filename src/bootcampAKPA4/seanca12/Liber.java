package bootcampAKPA4.seanca12;

public abstract class Liber {

	private String isbn;
	private String titull;

	public Liber(String isbn, String titull) {
		super();
		this.isbn = isbn;
		this.titull = titull;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public String getTitull() {
		return titull;
	}

	public void setTitull(String titull) {
		this.titull = titull;
	}

}
