package programm_General;

public class returnTypeMethod 
{
	public static String method1()
	{
		int a=1;
		int b=1;
		int c=a+b;
		System.out.println(c);
		String math="smbjc";
		String math1="smbjc2222";
		return math1;
	}

	public static void main(String[] args) 
	{
		returnTypeMethod.method1();
		
		String nm="dhdd";
		
		String vv = nm.concat(returnTypeMethod.method1());
		System.out.println(vv);
	}
}
