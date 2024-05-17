package bootcampAKPA4.seanca13;
import java.io.File;
import java.io.FileWriter;

public class ShkrimSkedar {
	private static final String SKEDARI_DALES_PATH = "C:\\Users\\AnjezaKamberi\\shembullWriter.txt";
	public static void main(String[] args) {

		System.out.println("Shkrim skedari");
		File fileIn = new File(SKEDARI_DALES_PATH);
		
		try (FileWriter file = new FileWriter(fileIn, true);) {

			if (fileIn.exists()) {
				file.write("Shto informacion 2");
				file.flush();
			} else {
				System.out.println("NUK GJEJ DOT FILE - IN");
			}

		} catch (Exception exception) {

			System.out.println("Skedari nuk gjendet!");

		}
	}
}
