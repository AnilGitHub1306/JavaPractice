package abstraction;

public abstract class AbstactClassA 
{

	public final void test1()
	{System.out.println("final method in abstract class");}
	
	public  final abstract void test2();
	
	
	static int a=100;
	int b=200;
	
	public void test3() {}
	
	
	public AbstactClassA() 
	{}
	public static void method1()
	{System.out.println("static complet method of abstract class");}
	
	public  void method2()
	{System.out.println("non static complet method of abstract class	");}
	
//	public static abstract void method2();           // static method can't be abstract
	
	public  abstract void method3();
	
	public static void main(String[] args) 
	{
		System.out.println(a);
		
		method1();
		
	//	AbstactClassA x= new AbstactClassA(5);      // not bale to create object hence cant call non static var and method
	}

}
