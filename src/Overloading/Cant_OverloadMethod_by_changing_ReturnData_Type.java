package Overloading;

public class Cant_OverloadMethod_by_changing_ReturnData_Type 
{
	
	
	public static void method()
	{System.out.println("methids x");}
	
	private static void method()
	{System.out.println("methids x");}
	
	 static void method()
	{System.out.println("methids x");}
	
	 protected static void method()
	{System.out.println("methids x");}
	 
	private  int method()
	{System.out.println("methids x");
	return 6;}
	
	public int method()
	{return 3;}
	
	public String method()
	{return "bat";}
	
	public static String method()
	{return "bat";}

	public static void method(String vbhv)
	{System.out.println("methids x");}
	
	public  int method(int c)
	{System.out.println("methids x");
	return 6;}
	
	public static void main(String[] args) 
	{
	}

}
