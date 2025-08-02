package string;

public class Replace {

	public static void main(String[] args) {

		String a = "AutXmatiXn tester";
		String a1= a.replace('X', 'o'); // replace character from entire string
		System.out.println(a1);
		
		String b = "AutXXXmatiXXXn tester";
		String z = "XXX";
		String b1= b.replaceAll('z', o); // replace character from entire string
		System.out.println(b1);
	}

}
