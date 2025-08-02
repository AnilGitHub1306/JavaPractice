package filehandling;

import java.io.File;
import java.io.IOException;

public class FileCreation {

	public static void main(String[] args) throws IOException {
		File ffile = new File("abc.text"); // file class defiled for folder
		System.out.println("object for the file is created");

		ffile.createNewFile(); // text file created
		System.out.println("file is created");

	}

}
