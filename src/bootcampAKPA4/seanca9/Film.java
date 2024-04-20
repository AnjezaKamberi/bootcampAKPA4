package bootcampAKPA4.seanca9;

import java.util.Scanner;

public class Film {

	// 1. vlereso film per cdo regjisor
	// 2. printo vleresimet per cdo film nga cdo regjisor
	// 3. printo filmin me vleresim me te larte

	public static void main(String[] args) {
		int nrFilm = 2;
		int nrRregjisor = 2;
		int[][] vleresimeFilmi = new int[nrFilm][nrRregjisor];
		vleresoFilmPerRregjisor(vleresimeFilmi);
		printoVleresimePerFilm(vleresimeFilmi);
		gjejVleresiminMax(vleresimeFilmi);

	}

	public static void vleresoFilmPerRregjisor(int[][] vleresime) {
		Scanner scanner = new Scanner(System.in);
		for (int nrFilm = 0; nrFilm < vleresime.length; nrFilm++) {
			System.out.println("Vleresim filmi :" + (nrFilm + 1));
			for (int nrRregjisor = 0; nrRregjisor < vleresime[nrFilm].length; nrRregjisor++) {
				System.out.println("Me jep vleresimin e filmit rregjisor: " + (nrRregjisor + 1));
				int pike = scanner.nextInt();
				vleresime[nrFilm][nrRregjisor] = pike;

			}
		}

	}

	public static void printoVleresimePerFilm(int[][] vleresime) {

		for (int nrFilm = 0; nrFilm < vleresime.length; nrFilm++) {
			System.out.println("Vleresim filmi :" + (nrFilm + 1));
			for (int nrRregjisor = 0; nrRregjisor < vleresime[nrFilm].length; nrRregjisor++) {
				System.out.println(
						"Rregjisori: " + (nrRregjisor + 1) + " Ka dhene vleresimin " + vleresime[nrFilm][nrRregjisor]);

			}

		}
	}

	public static void gjejVleresiminMax(int[][] vleresime) {
		int vleresimMax = 0, maxFilm = 0;
		int vleresimFilmi;

		for (int nrFilm = 0; nrFilm < vleresime.length; nrFilm++) {
			vleresimFilmi = 0;
			for (int nrRregjisor = 0; nrRregjisor < vleresime[nrFilm].length; nrRregjisor++) {
				vleresimFilmi = vleresimFilmi + vleresime[nrFilm][nrRregjisor];
			}

			if (vleresimFilmi > vleresimMax) {
				vleresimMax = vleresimFilmi;
				maxFilm = nrFilm;
			}

		}
		System.out.println("Film me shume pike eshte " + (maxFilm + 1) + " me vleresim " + vleresimMax);
	}
}
