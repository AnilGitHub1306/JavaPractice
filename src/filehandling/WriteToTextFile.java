package filehandling;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class WriteToTextFile {

	public static void main(String[] args) throws IOException {
		
		//fileclass is defined
		File f= new File("C:\\Users\\Anil\\git\\JavaPractice\\dataFolder\\Testing.csv");
		
		//file is created
		f.createNewFile();
		
		//PrintWriter class is defined to write in to the file
		PrintWriter pr = new PrintWriter(f);
		
		//line ready for write inside the file
		pr.println("abc111");
		pr.println("xyz222");
		pr.println("1j4333");
		
		//written line added to the file
		pr.flush();
		
		//file closed or printwriter object closed
		pr.close();
		
	}

}
