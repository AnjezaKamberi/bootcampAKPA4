package bootcampAKPA4.seanca2;

import bootcampAKPA4.seanca1a.KlasaA;

public class Main {

	public static void main(String[] args) {

		// krijoj nje objekt Date te paketes java.sql
		java.sql.Date dateSql = new java.sql.Date(123L);

		// krijoj nje objekt Date te paketes java.util
		java.util.Date dateUtil = new java.util.Date();

		// MENYRA E PARE

		// tipin KlasaA te paketes SEANCA1
		bootcampAKPA4.seanca1.KlasaA klasaASeanca1 = new bootcampAKPA4.seanca1.KlasaA();

		// tipin KlasaA te paktes SEANCA2
		bootcampAKPA4.seanca1a.KlasaA klasaASeanca2 = new bootcampAKPA4.seanca1a.KlasaA();

		// MENYRA E DYTE

		// tipin KlasaA te paketes SEANCA1
		KlasaA klasaASeanca1Obj2 = new KlasaA();

		// tipin KlasaA te paketes SEANCA2
		bootcampAKPA4.seanca1a.KlasaA klasaASeanca2Obj2 = new bootcampAKPA4.seanca1a.KlasaA();

	}
}
