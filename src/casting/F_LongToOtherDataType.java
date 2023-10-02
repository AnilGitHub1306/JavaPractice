package casting;

public class F_LongToOtherDataType 
{
	public static void main(String[] args) 
	{
	long l=34;
		
		boolean b= l!=0;				//long to boolean
		byte b1 = (byte)l;				//long to byte
		short s1 = (short) l; 			//long to short
		int i1 = (int) l;				//long to int
		long l1 = (long) l;				//long to long
		float f = (float) l;			//long to float
		double d = (double) l;			//long to double
		String str = Long.toString(l);	//long to String
		
		System.out.println("long to boolean	- "+b);
		System.out.println("long to byte	- "+b1);
		System.out.println("long to short	- "+s1);
		System.out.println("long to int	- "+ i1);
		System.out.println("long to long 	- " + l1);
		System.out.println("long to float 	- "+ f);
		System.out.println("long to double 	- "+d);
		System.out.println("long to String 	- "+ str);
		
	}

}
