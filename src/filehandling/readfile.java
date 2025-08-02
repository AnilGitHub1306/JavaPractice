package filehandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;

public class readfile {
	public static void main(String[] args) throws Exception {

		File file = new File("C:\\Users\\Anil\\git\\JavaPractice\\dataFolder\\Testing.csv");

		FileInputStream f1 = new FileInputStream(file);
			
		int a = f1.read();

		while (a != -1) {
			System.out.print((char) a);
			a = f1.read();
		}
		f1.close();
	}
}
