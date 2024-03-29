package bootcampAKPA4.seanca4;

// importoj klasen Scanner
import java.util.Scanner;

public class LeximInputi {

	// krijoj objektin Scanner
	private static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Me jep vitin e lindjes: ");
		// lexoj vitin e lindjes
		int vitLindje = input.nextInt();
		System.out.println("Viti i lindjes suaj eshte " + vitLindje);

		
		System.out.println("Me jep emrin: ");
		String emri = input.next();
		System.out.println("Emri juaj eshte " + emri);
		
		input.close();

	}
}
