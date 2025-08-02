package samapleA;

public class DemoB {
	
	public  void logOut() 
	{
		DemoA.userName="admin";   // static varible
		
		DemoA obj = new DemoA();
		obj.password="3562";
		obj.logIn();
		
		System.out.println("logOut success");
	}

}
