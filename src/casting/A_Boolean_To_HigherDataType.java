package casting;

public class A_Boolean_To_HigherDataType 

{

	public static void main(String[] args) 
	{
		boolean b =true;
		
		//Boolean to boolean
		boolean status1=b;
		
		//Boolean to byte
		byte a=(byte)(b?1:0);
		System.out.println("boolen to byte - " + a);
		
		//Boolean to short
		short s=(short)(b?1:0);
		System.out.println("boolen to short - " +s);
		
		//Boolean to int
		int i=(int)(b?1:0);
		System.out.println("boolen to int - " +i);
		
		//Boolean to long
		long l=(long)(b?1:0);
		System.out.println("boolen to long - " +l);
		
		//Boolean to float
		float f=(float)(b?1:0);
		System.out.println("boolen to float - " +f);
		
		//Boolean to double
		double d=(double)(b?1:0);
		System.out.println("boolen to double - " +d);
		
		//Boolean to char
		char c=(char)(b?1:0);
		System.out.println("boolen to char - " + c);
		
		//Boolean to String
	String str= Boolean.toString(b);
	System.out.println("boolen to String - " + str);
		
	}
}
