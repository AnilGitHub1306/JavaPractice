package programm_General;

public class DifferanceBetweenEqualsAnddoubleEqual 
{

	public static void main(String [] args)
	{
		String a = "Hello";
		String b = "Hello";
		
		System.out.println(a==b);    		 // result true
		System.out.println(a.equals(b));     // result true
		
		String c = new String("Hello");
		String d = new String("Hello");
		
		System.out.println(c==d);    		 // result false because here it compare the objects
		System.out.println(c.equals(d));     // result true
		
	}
}
