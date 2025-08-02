package samaple;

public class bdf 
{
	public static void main(String[] args) {
		String a= new String ("Test");
		String b= new String ("Test");
		String c = a;

		System.out.println(a==b);  // false
		System.out.println(c==a);  // true  
		System.out.println("nmk"=="nmk");
		
		System.out.println(a.equals(b));  // false
		System.out.println(c.equals(a));  // true 

		System.out.println("nmk".equals("nmk"));
	}

}




