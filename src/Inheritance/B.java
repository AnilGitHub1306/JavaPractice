package Inheritance;

public class B {
	
	static int B=10;
	public static void main(String[] args) {
		
		A x=new A();
		System.out.println(x.a);
		
		System.out.println("method B");
		System.out.println("B = "+B);
	}

}
