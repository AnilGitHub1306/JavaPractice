package methods;

public class NonStatic_Return_withArgument 
{
	public String method1(int h)
	{
		System.out.println("NonStatic_NonReturn_withOutArgument");
		return "xyz";
	}

	public static void main(String[] args) 
	{
		NonStatic_Return_withArgument b = new NonStatic_Return_withArgument();
		b.method1(2);

	}

}
