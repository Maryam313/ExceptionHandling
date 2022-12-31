import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.StringTokenizer;

/**
 * 
 */

/**
 * @author LAP-2
 *
 */
public class Task_1 {

	/**
Create a file named data.csv and store the following in it:
	The file should have a .csv extention.
	If the file already exist then just read the content of this file and store it in a HashMap<String, String[]>
	Print every key-value pair of the HashMap on console.
	 */
	public static void main(String[] args) {
		File myFile=new File("newdata.csv");

		try {
			//HashMap<String,String[]> mapInFile=new HashMap<String,String[]>();
			if(myFile.exists()) {
			myFile.createNewFile();
				FileWriter fileWriter =new FileWriter (myFile,true);
			System.out.println("I have created this"+Task_1.DATA_FILE_PATH);
			
			HashMap<String,String[]> hashmap = new HashMap<String,String[]>();
			Scanner sc=new Scanner(myFile);
			
			while(sc.hasNextLine()) {

				 String data[] = sc.nextLine().split(",");
				for(int i=0; i<data.length; i++){
					
					hashmap.put(data[0], data);
				}
			}
				for (String kString : hashmap.keySet()) {
					System.out.println(Arrays.toString(hashmap.get(kString)));
				
			}
			
			sc.close();
		}
		}
			catch (IOException e) {
				e.printStackTrace();

						
	}
		}
		public static final String DATA_FILE_PATH ="newdata.csv";

	}




