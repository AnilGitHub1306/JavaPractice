package abstraction;

public class ConcreteClassA extends AbstactClassA
{
	public static void method4()
	{System.out.println("1. static complet method of Concrete class");}
	
	public void method3()
	{System.out.println("2. AbstractClass method complited in concreate class");}
	
//	public static void method1()
//	{System.out.println("3. static complet method same in both class	");}
	
	public   void  method2()
	{System.out.println("4. non static complet method same in both class	");}
	
	public static void main(String[] args)
	{
		// abstract class element
		System.out.println(a);
		ConcreteClassA bn = new ConcreteClassA();
		System.out.println(bn.b);
		method1();
		bn.method2();
		
		// Concrete class element
		method4();
		bn.method3();
		
		
		
	}
}
