package methods;

public class NonStatic_Return_withOutArgument
{
	
	public String method1()
	{
		System.out.println("NonStatic_Return_withOutArgument");
		String h = "INDIA";
		return "BHARAT";
	}
	public static void main(String[] args) 
	{
		NonStatic_Return_withOutArgument b = new NonStatic_Return_withOutArgument();
		b.method1();
		
		String g = b.method1();
		System.out.println(g);
	}

}
