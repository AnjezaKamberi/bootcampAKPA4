package bootcampAKPA4.seanca10.kompozimi.one_to_one;

import java.time.LocalDate;

public class Autor {

	private String emer;
	private String mbiemer;
	private LocalDate datelindja;

	public String getEmer() {
		return emer;
	}

	public void setEmer(String emer) {
		this.emer = emer;
	}

	public String getMbiemer() {
		return mbiemer;
	}

	public void setMbiemer(String mbiemer) {
		this.mbiemer = mbiemer;
	}

	public LocalDate getDatelindja() {
		return datelindja;
	}

	public void setDatelindja(LocalDate datelindja) {
		this.datelindja = datelindja;
	}

	@Override
	public String toString() {
		return "Autor [emer=" + emer + ", mbiemer=" + mbiemer + ", datelindja=" + datelindja + "]";
	}

}
