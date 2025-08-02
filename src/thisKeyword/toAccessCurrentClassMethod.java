package thisKeyword;

public class toAccessCurrentClassMethod 
{
	public void methodOne() 
	{
        System.out.println("Method One");
        this.methodTwo(); // Explicitly calling methodTwo using 'this'
	}

    public static void methodTwo() 
    {System.out.println("Method Two");}
    
    public static void main(String[] args) {
		
    	toAccessCurrentClassMethod x = new toAccessCurrentClassMethod(); 
    	x.methodOne();
	}
}
