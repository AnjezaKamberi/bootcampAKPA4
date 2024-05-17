package bootcampAKPA4.seanca13;
import java.io.File;

public class KrijimFile {

	public static void main(String[] args) {

		File file1 = new File("C:\\Users\\AnjezaKamberi");
		System.out.println("Skedari 'file1' ekziston? " + file1.exists() + "\n");
		
		File parentFile = new File("C:\\Users\\akamberi");
		System.out.println("Skedari 'parentFile' ekziston? " + parentFile.exists() + "\n");
		
		File file2 = new File(parentFile, "formulasTable.json");
		System.out.println("Skedari 'file2' ekziston? " + file2.exists() + "\n");
		
		File file3 = new File("C:\\Users\\akamberi", "formulasTable.json");
		System.out.println("Skedari 'file3' ekziston? " + file3.exists() + "\n");

	}
}
