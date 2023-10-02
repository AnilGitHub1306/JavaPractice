package casting;

public class C_byte_To_Other_Datatype 
{
	public static void main(String[] args) 
	{
	byte by=100;
		
		boolean b= by!=0;				//byte to boolean
		byte b1 = (byte)by;				//byte to byte
		short s = (short) by; 			//byte to short
		int i = (int) by;				// byte to int
		long l = (long) by;				// byte to long
		float f = (float) by;			//byte to float
		double d = (double) by;			//byte to double
		String str = Byte.toString(by);	//byte to String
		
		System.out.println("byte to boolean	- "+b);
		System.out.println("byte to byte	- "+b1);
		System.out.println("byte to short	- "+s);
		System.out.println("byte to int	- "+ i);
		System.out.println("byte to long 	- " + l);
		System.out.println("byte to float 	- "+ f);
		System.out.println("byte to double 	- "+d);
		System.out.println("byte to String 	- "+ str);
		
	}
	
}
