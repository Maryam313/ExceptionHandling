import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * 
 */

/**
 * @author LAP-2
 *
 */
public class Task_3 {

	/**
	 * Read the following strings from the file (input.txt):
	 * 
	 * INPUT (from File: input.txt):
	 * 
	 * I am a sentence I am available in this file This file is the only place I can
	 * survive in You are free to process me Convert each of my line to uppercase
	 * Don't modify me please, just put the result in a different file call it the
	 * output.txt file
	 * 
	 * NOTE: Process all lines one by one from input.txt above and then convert
	 * those to uppercase and then write the following to the result.txt file:
	 * 
	 * OUTPUT (to File: result.txt):
	 * 
	 * I AM A SENTENCE I AM AVAILABLE IN THIS FILE THIS FILE IS THE ONLY PLACE I CAN
	 * SURVIVE IN YOU ARE FREE TO PROCESS ME CONVERT EACH OF MY LINE TO UPPERCASE
	 * DON'T MODIFY ME PLEASE, JUST PUT THE RESULT IN A DIFFERENT FILE CALL IT THE
	 * OUTPUT.TXT FILE
	 */

	public static void main(String[] args) {

		try {
			// FileWriter newFile=new FileWriter("input.txt",true);
			// FileWriter newFile2=new FileWriter("result.txt",true);

			File newFile = new File("input.txt");
			File newFile2 = new File("result.txt");

			System.out.println("I have created this" + Task_3.DATA_FILE_PATH);
			System.out.println("I have created this" + Task_3.DATA_FILE_PATH2);

			// newFile.close();
			BufferedReader input = (new BufferedReader(new FileReader(newFile)));
			PrintWriter result = (new PrintWriter(new FileWriter(newFile2)));

			int ch;
			while ((ch = input.read())!= -1) {
				if (Character.isLowerCase(ch)) {
					ch = Character.toUpperCase(ch);
				}
				result.write(ch);
			}

			input.close();
			result.close();
		} catch (IOException e) {
			e.printStackTrace();

		}

	}

	public static final String DATA_FILE_PATH = "input.txt";
	public static final String DATA_FILE_PATH2 = "result.txt";

}
