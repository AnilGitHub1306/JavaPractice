package variable;

public class localVariable 
{
	static int j=45;                        // static global variable
		   int k=56;                        // non static global variable
	
	
	public static void method1()
	{
	//	static int k=11;					// can't write static local variable
		int i;								// non static local variable
		
	//	System.out.println(i);  // compile time error
		System.out.println(j);
	}
	public static void main(String[] args) 
	{
		method1();
		System.out.println(j);
		System.out.println(i);             // can't call the user define method element
		
		
		
	}
}
