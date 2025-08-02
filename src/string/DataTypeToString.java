package string;

public class DataTypeToString 
{
public static void main(String[] args) {
	//data type to string
	boolean a = true;
	char b= 'a';
	byte c=100;
	short d=134;
	int e=15256;
	long f=232323232332l;
	float g=2323.232f;
	double h=2323.23232333d;
	
	
	String as = String.valueOf(a);
	String bs = String.valueOf(b);
	String cs = String.valueOf(c);
	String ds = String.valueOf(d);
	String es = String.valueOf(e);
	String fs = String.valueOf(f);
	String gs = String.valueOf(g);
	String hs= String.valueOf(f);
	
	System.out.println(as);
	System.out.println(bs);
	System.out.println(cs);
	System.out.println(ds);
	System.out.println(es);
	System.out.println(fs);
	System.out.println(gs);
	System.out.println(hs);
	
	System.out.println("**********************************");
	//wrapper class to string
		Boolean a1 = true;
		Character b1= 'a';
		Byte c1=100;
		Short d1=134;
		Integer e1=15256;
		Long f1=232323232332l;
		Float g1=2323.232f;
		Double h1=2323.23232333d;
	
		String a1s = String.valueOf(a1);
		String b1s = String.valueOf(b1);
		String c1s = String.valueOf(c1);
		String d1s = String.valueOf(d1);
		String e1s = String.valueOf(e1);
		String f1s = String.valueOf(f1);
		String g1s = String.valueOf(g1);
		String h1s= String.valueOf(f1);
		
		
		System.out.println(a1s);
		System.out.println(b1s);
		System.out.println(c1s);
		System.out.println(d1s);
		System.out.println(e1s);
		System.out.println(f1s);
		System.out.println(g1s);
		System.out.println(h1s);
}
}
