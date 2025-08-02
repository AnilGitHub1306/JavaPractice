package callingOneElementToOtherClass;

public class Method2 
{
	

	public static void main(String[] args) 
	{
		Method1.m1();
		Method1 x = new Method1();
		
		x.m2();
	}

}
