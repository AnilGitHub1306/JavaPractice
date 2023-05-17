package methods;

public class NonStatic_NonReturn_withArgument
{
	int g;
	int p=22;
	public void method1(String x)
	{
		System.out.println("NonStatic_NonReturn_withArgument");
		g=11;
		System.out.println(p);
	}

	public static void main(String[] args)
	{
		NonStatic_NonReturn_withArgument object = new NonStatic_NonReturn_withArgument();
		object.method1("test");
		System.out.println(object.p);
		
	}

}
