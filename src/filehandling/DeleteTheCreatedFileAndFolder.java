package filehandling;

import java.io.File;
import java.io.IOException;

public class DeleteTheCreatedFileAndFolder {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		
		File ffolder = new File("Test"); // file class defiled for folder
		System.out.println("object for the folder is created");
		
		ffolder.mkdir();				// Folder is created
		System.out.println("Folder is created");
		
		File ffile = new File("abc.text");  // file class defiled for folder
		System.out.println("object for the file is created");
		
		ffile.createNewFile();         		// text file created
		System.out.println("file is created");
		
		boolean f1= ffolder.isDirectory();				// Checking test is a folder
		System.out.println("Yes it is the folder: "+ f1);
		
		boolean f2= ffile.isFile();						//checking abc is file
		System.out.println("Yes it is the file: "+ f2);
		
		boolean ffiledelete=ffile.delete();						//file deleted
		System.out.println("Yes file is deleted: "+ ffiledelete);
		
		
		  boolean ffolderdelete=ffolder.delete(); //file deleted
		  System.out.println("Yes folder is deleted: "+ ffolderdelete);
		 
	}

}
