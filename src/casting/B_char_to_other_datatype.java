package casting;

public class B_char_to_other_datatype 
{

	public static void main(String[] args) 
	{
		char ch='t';
		
		boolean b= ch!=1;	//char to boolean
		byte by = (byte)ch;	//char to byte
		short s = (short) ch; //char to short
		int i = (int) ch;	// char to int
		long l = (long) ch;		// char to long
		float f = (float) ch;	//char to float
		double d = (double) ch;	//char to double
		String str = Character.toString(ch);	//char to String
		
		System.out.println("char to boolean - "+b);
		System.out.println("char to byte-"+by);
		System.out.println("char to short - "+ s);
		System.out.println("char to int -"+i);
		System.out.println("char to long -" + l);
		System.out.println("char to float - "+f);
		System.out.println("char to double - "+d);
		System.out.println("char to String - "+ str);
		
	}
}
