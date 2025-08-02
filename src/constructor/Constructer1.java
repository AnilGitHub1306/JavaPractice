package constructor;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class Constructer1 {

	static int a;
	static int b;
	static int c =10000;
	int t=900;
	
	public Constructer1()
	{
		a=56;
		System.out.println(a);
	}
	
	public void m1()
	{System.out.println("m1 mrthod");}
	
	public static void main(String[] args) 
	{
		b=12;
		b=123;
		System.out.println(b);
		
		Constructer1 obj = new Constructer1();
		
		System.out.println(obj.t);
	
	}

}
