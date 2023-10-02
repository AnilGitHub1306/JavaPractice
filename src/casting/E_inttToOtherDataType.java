package casting;

public class E_inttToOtherDataType 
{
	public static void main(String[] args) 
	{
	int i=100;
		
		boolean b= i!=0;				//int to boolean
		byte b1 = (byte)i;				//int to byte
		short s1 = (short) i; 			//int to short
		int i1 = (int) i;				//int to int
		long l = (long) i;				//int to long
		float f = (float) i;			//int to float
		double d = (double) i;			//int to double
		String str = Integer.toString(i);	//int to String
		
		System.out.println("int to boolean	- "+b);
		System.out.println("int to byte	- "+b1);
		System.out.println("int to short	- "+s1);
		System.out.println("int to int	- "+ i1);
		System.out.println("int to long 	- " + l);
		System.out.println("int to float 	- "+ f);
		System.out.println("int to double 	- "+d);
		System.out.println("int to String 	- "+ str);
		
	}

}
