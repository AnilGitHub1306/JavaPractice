package filehandling;

import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

public class writefile 
{
	public static void main(String[] args) throws Exception {
		
		/*
		 * File file =new File("C:\\Users\\Anil\\git\\JavaPractice\\textFile1.text");
		 * file.createNewFile();
		 * 
		 * FileOutputStream f1= new FileOutputStream(file); OutputStreamWriter f2 = new
		 * OutputStreamWriter(f1);
		 * 
		 * f2.write("admin:\n"); f2.write("password\n");
		 * 
		 * f2.flush(); f2.close();
		 */
		//********************************************************8
	
		File file =new File("C:\\Users\\Anil\\git\\JavaPractice\\textFile1.text");
		file.createNewFile();
	
		FileOutputStream f1= new FileOutputStream(file);
	
		String s= "1dfcZDcZC";
		String s2= "2dfcZDcZC";
		f1.write(s.getBytes());
		System.out.println("");
		f1.write(s2.getBytes());
		
		f1.flush();
		f1.close();
		
	
	
	
	
	}
}
