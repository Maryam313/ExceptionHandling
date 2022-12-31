import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Scanner;

import javax.sound.sampled.Line;

/**
 * 
 */

/**
 * @author LAP-2
 *
 */
public class Task_2 {

	/**
Take input from user and store it in data.csv file as follows:

INPUT: (Enter your name: ) Mr.A
	   (Enter your email: ) mr.a@gmail.com

ACTION: After the input, the data.csv file should look like this:
001, Mr.A, mr.a@gmail.com, true

INPUT: (Enter your name: ) Mr.B
	   (Enter your email: ) mr.b@gmail.com
 
ACTION: After the input, the data.csv file should look like this:
002, Mr.B, mr.b@gmail.com, true	 
	 * @throws IOException */
	
	

		public static void main(String[] args) throws IOException {
			File dataStore=new File(Task_2.DATA_FILE_PATH);

			if(dataStore.exists()) {
				
			try {
				//BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
				 FileWriter fw = new FileWriter(dataStore,true);
				Scanner fileInput = new Scanner(System.in);
						 //Read each line of the file
						//while (fileInput.hasNextLine()) {
						System.out.println("Enter your name:");
						String line = fileInput.nextLine();

						System.out.println("Enter your email:");
						String line2 = fileInput.nextLine();
						
						fw.write(line+line2+"true");
						fileInput.close();
						fw.close();
			
				//	PrintWriter result = (new PrintWriter(new FileWriter(fw)));

				 //PrintWriter out = new PrintWriter("data.csv", "UTF-8");
				//    Scanner sc = new Scanner(System.in);
//				    FileWriter fw = new FileWriter(dataStore);
//				    while(true){
////						System.out.println("Enter your name: ");
////				        String input1 = sc.nextLine();
////						System.out.println("Enter your email: ");
////				        String input2 = sc.nextLine();
////				     
//
				
//				        if("DONE".equalsIgnoreCase(input1.trim())){
//					        if("DONE".equalsIgnoreCase(input2.trim())){
//
//				            break;
//				        }
//				        fw.write(input1);
//				        fw.write(input2);
//
//				    }
//				    sc.close();
//				    fw.close();

				    
	
			
			} catch (FileNotFoundException e) {
				System.out.println("Have you even created a file?");
				e.printStackTrace();
		
			
			
			}
		}
						}
	
		
		public static final String DATA_FILE_PATH ="new_data.csv";
		
	
		
		
		
	

}
