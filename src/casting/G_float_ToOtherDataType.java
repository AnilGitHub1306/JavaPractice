package casting;

public class G_float_ToOtherDataType 
{
	public static void main(String[] args) 
	{
	float f=1.9f;
		
		boolean b= f!=0;				//float to boolean
		byte b1 = (byte)f;				//float to byte
		short s = (short) f; 			//float to short
		int i = (int) f;				//float to int
		long l = (long) f;				//float to long
		float f1 = (float) f;			//float to float
		double d = (double) f;			//float to double
		String str = Float.toString(f);	//float to String
		
		System.out.println("float to boolean- "+b);
		System.out.println("float to byte	- "+b1);
		System.out.println("float to short	- "+s);
		System.out.println("float to int	- "+ i);
		System.out.println("float to long 	- " + l);
		System.out.println("float to float 	- "+ f1);
		System.out.println("float to double - "+d);
		System.out.println("float to String - "+ str);
		
	}

}
