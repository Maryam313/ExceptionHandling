import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 * 
 */

/**
 * @author LAP-2
 *
 */
public class FilingWorld {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		File dataStore=new File(FilingWorld.DATA_FILE_PATH);
		if(dataStore.exists()) {
			
		try {
			
			Scanner fileScanner=new Scanner(dataStore);
			String currLine=fileScanner.nextLine();
			while(fileScanner.hasNextLine()) {
				System.out.println(fileScanner.nextLine());
			}
			fileScanner.close();
//		FileWriter fileWriter =new FileWriter (dataStore);
//		fileWriter.write("Finally something got written to a file");
//		fileWriter.close();
		} catch (FileNotFoundException e) {
			System.out.println("Have you even created a file?");
			//e.printStackTrace();
		}
		catch (Exception e) {
			System.out.println("I dont know whats wrong!");
			// TODO: handle exception
		}
		
		
		}else {
		try {
		FileWriter newFile=new FileWriter("data.txt",true);
		System.out.println("I have created this"+FilingWorld.DATA_FILE_PATH);

		newFile.write("I am empty now!!");
		newFile.write("I am empty now!!");
		newFile.write("I am empty now!!");
		newFile.close();
		
	}catch (IOException e) {
		e.printStackTrace();

	}
			
}
	}
	public static final String DATA_FILE_PATH ="data.txt";
	
}
