package samapleB;

import samapleA.DemoA;

public class DemoC {

	
	public static void main(String[] args) 
	{
		DemoA.userName="admin";
		
		DemoA obj = new DemoA();
		obj.password="123";
		obj.logIn();
	}
	
}
