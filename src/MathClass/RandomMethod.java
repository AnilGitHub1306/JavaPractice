package MathClass;

public class RandomMethod {

	public static void main(String[] args) 
	{
		
		Double a= Math.random();
		System.out.println(a);		//Random value printed 0.0 to 1.0
		
		double a1= Math.random();
		
		int b=(int) (a1);         
		System.out.println(b);  //Random value converted to integer
		
		int c=(int) (a1*10);
		System.out.println(c);	//Random value printed in 0 to 10
		
		int d=(int) (a1*100);
		System.out.println(d);	//Random value printed in 0 to 100
		
		int e=(int) (a1*1000);
		System.out.println(e);	//Random value printed in 0 to 1000
		
		
		//Random value printed in range min to max
	//	int f=(int) (Math.random()*(max-min+1)+min);
		int f=(int) (Math.random()*(900-100+1)+100);
		System.out.println(f);						//243
	}

}
