package bootcampAKPA4.seanca10.trashegimia;

public class MakineSmart extends Makine {

	public MakineSmart(String ngjyra, String targa, int shpejtesia) {
		super(targa, ngjyra, shpejtesia);
	}

	@Override
	public void menaxhoLevizje() {
		System.out.println("Ky eshte nje mjet transporti MAKINE dhe une mund te percaktoj" + "si ai leviz");
		System.out.println("Smart mund te leviz me marshe ose automat");
	}

	// @Override e gabuar
	public void menaxhoLevizje(String llojLevizje) {
		System.out.println("Makina smart do leviz me " + llojLevizje);
	}
}
