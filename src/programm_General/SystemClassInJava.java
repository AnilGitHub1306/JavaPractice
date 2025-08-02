package programm_General;

import java.util.Properties;

public class SystemClassInJava {

	public static void main(String[] args) {

		Properties prop = System.getProperties();
		
		System.err.println(prop);

	}
}