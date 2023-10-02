package casting;

public class I_StringoOtherDataType 
{
	public static void main(String[] args) 
	{
		String str="34";
		
		boolean b= Boolean.parseBoolean(str);		//String to boolean
		byte b1 = Byte.parseByte(str);				//String to byte
		short s = Short.parseShort(str); 			//String to short
		int i = Integer.parseInt(str);				//String to int
		long l = Long.parseLong(str);				//String to long
		float f = Float.parseFloat(str);			//String to float
		double d1 = Double.parseDouble(str);		//String to double
		String str1 = str;							//String to String
		
		System.out.println("String to boolean- "+b);
		System.out.println("String to byte	- "+b1);
		System.out.println("String to short	- "+s);
		System.out.println("String to int	- "+ i);
		System.out.println("String to long 	- " + l);
		System.out.println("String to float - "+ f);
		System.out.println("String to double - "+d1);
		System.out.println("String to String - "+ str1);
		
	}

}
