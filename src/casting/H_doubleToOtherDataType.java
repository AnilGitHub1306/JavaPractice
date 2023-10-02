package casting;

public class H_doubleToOtherDataType 
{
	public static void main(String[] args) 
	{
		double d=100;
		
		boolean b= d!=0;				//double to boolean
		byte b1 = (byte)d;				//double to byte
		short s = (short) d; 			//double to short
		int i = (int) d;				//double to int
		long l = (long) d;				//double to long
		float f = (float) d;			//double to float
		double d1 = (double) d;			//double to double
		String str = Double.toString(d);//double to String
		
		System.out.println("double to boolean	- "+b);
		System.out.println("double to byte	- "+b1);
		System.out.println("double to short	- "+s);
		System.out.println("double to int	- "+ i);
		System.out.println("double to long 	- " + l);
		System.out.println("double to float 	- "+ f);
		System.out.println("double to double 	- "+d1);
		System.out.println("double to String 	- "+ str);
		
	}

}
