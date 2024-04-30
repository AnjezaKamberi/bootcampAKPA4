package bootcampAKPA4.seanca10.kompozimi.one_to_one;

public class Liber {

	private String titull;
	private String shtepiBotuese;
	private Autor autor;

	public String getTitull() {
		return titull;
	}

	public void setTitull(String titull) {
		this.titull = titull;
	}

	public String getShtepiBotuese() {
		return shtepiBotuese;
	}

	public void setShtepiBotuese(String shtepiBotuese) {
		this.shtepiBotuese = shtepiBotuese;
	}

	public Autor getAutor() {
		return autor;
	}

	public void setAutor(Autor autor) {
		this.autor = autor;
	}

	@Override
	public String toString() {
		return "Liber [titull=" + titull + ", shtepiBotuese=" + shtepiBotuese + ", autor=" + autor + "]";
	}

}
