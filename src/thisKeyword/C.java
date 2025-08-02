package thisKeyword;
public class C 
{
	int a;
	public  void show(int a)
	{System.out.println(a);
	System.out.println(this.a);}
	
	public static void main(String[] args) 
	{
		C x= new C();
	
		x.show(1);
	}
}


