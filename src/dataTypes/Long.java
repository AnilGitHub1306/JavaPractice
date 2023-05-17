package dataTypes;

public class Long 
{
	public static void main(String[] args) 
	{
		long a= -1234567890;						// for small no. l is not necessary (support up to 10 digit)
		long min=-1234567890123456789l;				// for big no. l is necessary (support up to 19 digit)
		long max= 1234567890123456789l;
		
		System.out.println(a);
		System.out.println(max);
		System.out.println(min);
	}

}
