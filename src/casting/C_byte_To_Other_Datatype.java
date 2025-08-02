package casting;

public class C_byte_To_Other_Datatype 
{
	public static void main(String[] args) 
	{
	byte x=100;
		
		boolean b= x != 0;				//byte to boolean
		byte b1 = (byte)x;				//byte to byte
		short s = (short) x; 			//byte to short
		int i = (int) x;				// byte to int
		long l = (long) x;				// byte to long
		float f = (float) x;			//byte to float
		double d = (double) x;			//byte to double
		String str = Byte.toString(x);	//byte to String
		
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
