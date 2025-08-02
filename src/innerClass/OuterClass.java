package innerClass;

public class OuterClass 
{	
	 //Variable
	static int a=3;

	//Inner Class
		 class InnerClass 
		 {
			 int y = 5;
		 }
	// Method
		 public static void main(String[] args) 
		 {
			
			 System.out.println("main method");
			 {System.out.println("Inner block");}
		 }
//Block	 
	static {System.out.println("outer block");}
	
}
