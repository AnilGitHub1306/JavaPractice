package SuperKeyword;
public class classA 
{
	static int a=10;
	
	public static void test()
	{System.out.println("classA- static test");}
	
	int b=10;
	public void test1()
	{System.out.println("classA- test");}
	
	public classA()
	{System.out.println("classA constructor");}
	
	public static void main(String[] args) 
	{
		System.out.println(a);
		test();
		
		classA obj =new classA();
		System.out.println(obj.b);
		obj.test1();	
	}
}
