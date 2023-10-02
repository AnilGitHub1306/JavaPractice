package interfaceConcept;

public interface interfaceB 
{
	static  int a = 100;
	        int b =46;
	
	public static void method1() {}
//	public static void method2();       // not possible
//				  void method3() {}     // not possible
	              void method4();
	
	
	public static void main(String[] args) 
	{
		System.out.println(a);
		
	//	interfaceA n= new interfaceA();    // not possible
	//  System.out.println(n.b);           // not possible
	//	method1();      // not possible
		
		
	}
	

}
