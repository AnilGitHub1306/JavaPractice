package AccessModifierScope1;

public class ClassB 
{
	static int x=99;
	int y = 91;
	public static void main(String[] args) 
	{
		System.out.println(ClassA.a1);
		
		ClassA driver1 = new ClassA();
		
		System.out.println(ClassA.a2);
	//	System.out.println(driver.a3);          // its private and its scope within the class
		System.out.println(driver1.a4);
		
		ClassA.methodA();
		driver1.methodB();
		
		System.out.println(x);
		
		ClassB obj = new ClassB();
		
		System.out.println(obj.y);
		
	}
}
