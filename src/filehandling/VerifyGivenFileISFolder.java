package filehandling;

import java.io.File;
import java.io.IOException;

public class VerifyGivenFileISFolder {
	public static void main(String[] args) throws IOException {

		File ffolder = new File("Test"); // file class defiled for folder
		System.out.println("object for the folder is created");

		ffolder.mkdir(); // Folder is created
		System.out.println("Folder is created");

		boolean f1 = ffolder.isDirectory(); // Checking test is a folder
		System.out.println("Yes it is the folder: " + f1);
	}
}
