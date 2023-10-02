package methods;

public class static_Method_Can_Accept_Non_Static_Element 
{

	static int x=10;
	int y=20;
	
	public static void staticMethod()
	{
		System.out.println(x);
		
		static_Method_Can_Accept_Non_Static_Element var = new static_Method_Can_Accept_Non_Static_Element();
		System.out.println(var.y);
	}
	
	public  void nonStaticMethod()
	{
		System.out.println(x);
		
		static_Method_Can_Accept_Non_Static_Element var = new static_Method_Can_Accept_Non_Static_Element();
		System.out.println(var.y);
	}
	
	
	
	public static void main(String[] args) 
	{
		static_Method_Can_Accept_Non_Static_Element var = new static_Method_Can_Accept_Non_Static_Element();

		staticMethod();
		var.nonStaticMethod();
	}

}
