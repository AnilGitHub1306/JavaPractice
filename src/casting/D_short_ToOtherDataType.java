package casting;

public class D_short_ToOtherDataType {
	public static void main(String[] args) {
		short s = 100;

		boolean b = s != 0; // short to boolean
		byte b1 = (byte) s; // short to byte
		short s1 = (short) s; // short to short
		int i = (int) s; // short to int
		long l = (long) s; // short to long
		float f = (float) s; // short to float
		double d = (double) s; // short to double
		String str = Short.toString(s); // short to String

		System.out.println("short to boolean	- " + b);
		System.out.println("short to byte	- " + b1);
		System.out.println("short to short	- " + s1);
		System.out.println("short to int	- " + i);
		System.out.println("short to long 	- " + l);
		System.out.println("short to float 	- " + f);
		System.out.println("short to double 	- " + d);
		System.out.println("short to String 	- " + str);

	}

}
