package methods;

public class StaticMethod_NonReturnType_WithArgument 
{
	
	static int t=23;
	int s =12;
	static int b;

	public static void method1(int x)
	{
		b=23;
		System.out.println("StaticMethod_NonReturnType_WithArgument");			
	}
	
	 static void method2( int g)
	{
		System.out.println("StaticMethod_NonReturnType_WithArgument_without public keyword");
		System.out.println(t);
		
		StaticMethod_NonReturnType_WithArgument m = new StaticMethod_NonReturnType_WithArgument();
		System.out.println(m.s);
	}
	
	
	 
	
	
	public static void main(String[] args) 
	{
		method1(1);
		StaticMethod_NonReturnType_WithArgument.method1(100);

		method2(73);
		StaticMethod_NonReturnType_WithArgument.method2(1);
		
		System.out.println(t);
	}
}
