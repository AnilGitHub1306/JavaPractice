package constructor;

public class ConstructorOverloading 
{

	public ConstructorOverloading()
	{System.out.println("INDIA");}
	
	public ConstructorOverloading(int x)
	{System.out.println("BHARAT");}
	
//	protected ConstructorOverloading()
//	{}
	
	
	
	
	//void ConstructorOverloading()
	//{}
	
//	int ConstructorOverloading()                    // if data type used with cons then it not cons. its a method. cons can't be return type
//	{return 4;}
	
	
	
	public static void main(String[] args)
	{
		ConstructorOverloading b =new ConstructorOverloading();
		ConstructorOverloading c =new ConstructorOverloading(4);
	}
}

