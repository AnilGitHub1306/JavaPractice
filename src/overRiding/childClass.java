package overRiding;

public class childClass extends ParentClass
{
	public void a()
	{ System.out.println("child class method a");}
	
	public static void b()
	{ System.out.println("child class static method b");}
	
	public static void main(String[] args) 
	{
		childClass obj =new childClass();
		//obj.a();
		b();
		
		
		ParentClass pobj = new ParentClass();
		//pobj.a();
	}
}
