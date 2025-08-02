package thisKeyword;

import java.util.ArrayList;
import java.util.Arrays;

public class b 
{
	 int a;
	
	public  void show()
	{
		this.a=a;
		System.out.println(this);}
	
	public static void main(String[] args) 
	{
		b x= new b();
		System.out.println(x);
		System.out.println(System.getProperty("user.dir"));
		System.out.println(System.getProperty("user.name"));
		System.out.println(System.getProperty("java.version"));
		System.out.println(System.getProperty("os.name"));

		ArrayList<Integer> a = new ArrayList<Integer>();
		a.add(10);
		System.out.println(a);
	System.out.println(Arrays.asList(a));	
		
	}
	
}


