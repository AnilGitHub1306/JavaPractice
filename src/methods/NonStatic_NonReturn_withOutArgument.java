package methods;

public class NonStatic_NonReturn_withOutArgument 
{
	public void method1()
	{
		System.out.println("NonStatic_NonReturn_withOutArgument");
	}

	public static void main(String[] args)
	{
		NonStatic_NonReturn_withOutArgument  object = new NonStatic_NonReturn_withOutArgument ();
		object.method1();
	
		
	}

}
