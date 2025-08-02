package thisKeyword;

public class toAccessCurrentClassConstructor 
{
	static int x;

    public toAccessCurrentClassConstructor (int x) 
    {System.out.println("const 1");}
    
    public toAccessCurrentClassConstructor () 
	{
        this(x); 
        System.out.println("const 2");
	}
    
    public static void main(String[] args) {
		
    	toAccessCurrentClassConstructor x = new toAccessCurrentClassConstructor(); 
    }
}
