package string;

public class Split 
{
	public static void main(String[] args) 
	{
		String str ="Automation testing is good";
		
		String a[]=str.split(" ");
		
		System.out.println(str);
		System.out.println(a[0]);
		System.out.println(a[1]);
		System.out.println(a[2]);
		System.out.println(a[3]);	
	}
}
