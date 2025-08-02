package filehandling;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class ReadTextFile {

	public static void main(String[] args) throws Exception {
		
		File f= new File("C:\\Users\\Anil\\git\\JavaPractice\\dataFolder\\Testing.csv");
		FileReader fr= new FileReader(f);
		BufferedReader br = new BufferedReader(fr);
		String s= br.readLine();
		
		while(s!=null)
		{
			System.out.println(s);
			
			s=br.readLine();      // to move cursor to next line
		}
		
		
	}

}
