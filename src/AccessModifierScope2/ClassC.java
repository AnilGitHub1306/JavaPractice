package AccessModifierScope2;

import AccessModifierScope1.ClassA;
import AccessModifierScope1.ClassB;

public class ClassC extends ClassA
{

	static int xx=99;
	int yy = 91;
	public static void main(String[] args) 
	{
		System.out.println(ClassA.a1);
		
		ClassA driver1 = new ClassA();
		
	// 	System.out.println(ClassA.a2);			// its default and its scope within the package
	//	System.out.println(driver1.a3);          // its private and its scope within the class
		
		ClassC driver2 = new ClassC();
		System.out.println(driver2.a4);
		
		ClassA.methodA();
		driver1.methodB();
		
		System.out.println(xx);
		System.out.println(driver2.yy);
		
	}

}
