package bootcampAKPA4.seanca9;

public class Array2D {

	public static void main(String[] args) {
		
		// krijimi i nje array2D
		int numerProvime = 5;
		int numerStudent = 5;
		//int[][] provimVleresime = new int[numerProvime][numerStudent];
		
		int[][] provimVleresime = {
				{8, 8, 9, 4, 5}, 
				{5, 8, 7, 5, 9},
				{5, 10, 5, 8, 7}, 
				{8, 10, 5, 9, 7}, 
				{9, 8, 8, 6, 5}
		};
		
		// vendos noten 10 per studentin 2 ne lenden ARTE
		provimVleresime[3][1] = 10;
		//System.out.println("Nota e studentit 2 ne lenden ARTE eshte " + provimVleresime[3][1]);
		
		// vendos noten 7 per studentin 3 ne lenden MATEMATIKE
		provimVleresime[1][2] = 7;
		//System.out.println("Nota e studentit 3 ne lenden MATEMATIKE eshte " + provimVleresime[1][2]);
	
		// vendos noten 5 per studentin 5 ne lenden FIZIKE
		provimVleresime[4][4] = 5;
		//System.out.println("Nota e studentit 5 ne lenden FIZIKE eshte " + provimVleresime[4][4]);
	
		printoVleresimePerStudent(provimVleresime);
	}
	
	
	public static void printoVleresimePerStudent(int[][] vleresime) {
		
		for(int indexRresht = 0; indexRresht < vleresime.length; indexRresht++ ) {
			System.out.println("Lexojme vleresimet per lenden " + (indexRresht+1));
			for(int indexKolona = 0; indexKolona < vleresime[indexRresht].length; indexKolona++) {
				System.out.println("Nota e studentit " + (indexKolona + 1) + " eshte " + 
						vleresime[indexRresht][indexKolona]
						);
				
			}
			System.out.println("****************************************");
		}
	}
	
}
