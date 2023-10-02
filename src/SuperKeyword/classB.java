package SuperKeyword;
public class classB extends classA
{
	static int a=20;
	int b=20;
	
	public static void test()
	{System.out.println("classB- static test");}
	
	public  void test2()
	{System.out.println("classB- test");}
	
	public  void prog()
	{	System.out.println(super.a);
		System.out.println(super.b);
		super.test();
		super.test1();}
	
	public classB()
	{	super();
		System.out.println("classB Constructor");}
	
	public static void main(String[] args) 
	{
		classB obj =new classB();
		obj.prog();
	}
}
