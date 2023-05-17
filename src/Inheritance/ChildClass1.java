package Inheritance;

public class ChildClass1 extends ParentClass1
{
	static int a=100;
	int b=200; 

	 String act= super.act1;
	 
	public ChildClass1()
	{	super();
		System.out.println("child class constructor");}
	
	public static void method3()
	{System.out.println("Child class static method");}
	
	public void method4()
	{System.out.println("Child class non static method");}
	
	
	
	public void method5()
	{System.out.println(super.a);
	System.out.println(super.b);
	super.method3();
	super.method4();}
	
	
	
	public static void main(String[] args)
	{
		System.out.println(a);							// child class static variable
		System.out.println(ChildClass1.a); 				// child class static variable
		
		ChildClass1 obj= new ChildClass1();
		System.out.println(obj.b);                     // child class non static variable
	//	super.method3();								// Cant over ride the parent class staic method
		method3();		          					   // child class static method												
		obj.method4();            					   // child class non static method
						
		
		method1();                                     //ParentClass1 static method
		obj.method2();                                 //ParentClass1non static method
	
		System.out.println(a1);   					   // parent  class static global variable
		System.out.println(obj.a2);					   // parent  class static global variable
		
		obj.method5();									// child class method to call parent class variable and method which is same as child class
		
		
		//ParentClass1 h =new ParentClass1(4);
		
		//System.out.println(h.b);
	}
}
