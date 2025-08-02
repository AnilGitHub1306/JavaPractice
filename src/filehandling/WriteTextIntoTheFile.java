package filehandling;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriteTextIntoTheFile {

	public static void main(String[] args) throws Exception {
		
		File fileFile = new File("textFile.text"); //file class define for file 
		fileFile.createNewFile(); // file is created
		
		FileWriter fw = new FileWriter(fileFile); // filewriter class define to write in it
		fw.write("Username:"); // text written and ready to add in file
		fw.write("admin@1234\n");
		fw.write("Password:");
		fw.write("Admin@1234\n");
		
		fw.flush(); // written text are added to the file
		fw.close(); // object for the filewriter class closed. file closed.
		
	}

}
