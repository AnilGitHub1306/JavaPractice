package AccessModifierScope1;

public class ClassA 
{
	public static int a1=1;
	static int a2=11;
	private int a3=111;
	protected int a4=1111;

	
	public static void methodA()
	{System.out.println("ClassA static method a");}
	
	public  void methodB()
	{System.out.println("ClassA static method a");}
	
	public static void main(String[] args) 
	{
		System.out.println(a1);
		
		ClassA driver = new ClassA();
	
		System.out.println(ClassA.a2);
		System.out.println(driver.a3);
		System.out.println(driver.a4);
		
		ClassA.methodA();
		driver.methodB();
		
		
	}
}
