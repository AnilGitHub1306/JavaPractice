package thisKeyword;
public class a 
{
	public  void show()
	{System.out.println(this);}
	
	public static void main(String[] args) 
	{
		a x= new a();
		System.out.println(x);
		x.show();
	}
}


