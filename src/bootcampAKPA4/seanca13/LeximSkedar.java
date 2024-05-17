package bootcampAKPA4.seanca13;

import java.io.*;

public class LeximSkedar {

	private static final String SKEDARI_HYRES_PATH = "C:\\Users\\AnjezaKamberi\\shembullReader.txt";

	public static void main(String[] args) throws IOException {

		System.out.println("Lexim skedari");

		// menyra e pare 
		try (FileReader file = new FileReader(SKEDARI_HYRES_PATH)) {

			int index;
			
			while ((index = file.read()) != -1) {
				System.out.print((char) index);
			}
			
			System.out.println("LEXIMI SKEDARIT MBAROI");
			
		} catch (IOException exception) {
			System.out.println("Skedari nuk gjendet!");
		}
		
		// menyra e dyte 

		/*FileReader file = null;
		try {
			file = new FileReader(SKEDARI_HYRES_PATH);
		} catch (IOException e) {

		} finally {
			file.close();
		}*/
		

	}
}
