import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * 
 */

/**
 * @author LAP-2
 *
 */
public class Filing {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		File myFile=new File("ABC.txt");
		try {
			myFile.createNewFile();
			FileWriter fileWriter =new FileWriter (myFile,true);
			System.out.println("I have created this"+Filing.DATA_FILE_PATH);

			fileWriter.write("Finally something got written to a file\n");
			fileWriter.write("Finally something got written to a file\n");
			fileWriter.write("Finally something got written to a file\n");

			//fileWriter.close();

		}catch (IOException e1) {
			e1.printStackTrace();
		
	}catch (Exception e) {
		System.out.println("I don't Know what happining"+e);
	}
	}
	public static final String DATA_FILE_PATH ="ABC.txt";

}
