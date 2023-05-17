package methods;

public class StaticMethod_NonReturnType_WithoutArgument 
{

	public static String method1()
	{
		System.out.println("StaticMethod_NonReturnType_WithoutArgument");
		return "x";
	}
	public static void main(String[] args) {

		method1();
		StaticMethod_NonReturnType_WithoutArgument.method1();

	}

}
