package methods;

public class StaticMethod_ReturnType_WithArgument 
{
	
	public static int method1(int x)
	{
	//	System.out.println("StaticMethod_ReturnType_WithArgument");
		
		int a=10;
		int b=20;
		int c= a+b;
		return 34;
	}
	
	
	public static void main(String [] args)
	{
	
		int z= 100 + method1(1);
		
		method1(1);
		StaticMethod_ReturnType_WithArgument .method1(1);
	}
}
