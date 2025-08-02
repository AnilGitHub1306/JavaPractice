package collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.Stack;
import java.util.Vector;

public class linkedListToArray {

	public static void main(String[] args) 
	{
		List <String> firstName =  new ArrayList();
		firstName.add("adinath");
		firstName.add("adinath1");
		firstName.add("adinath2");
		firstName.add("adinath3");
		firstName.add("adinath4");
		
		Object[] a= firstName.toArray();
		System.out.println(a[3]);
	//--------------------------------------------------------------	
		
		List <String> firstName1 =  new LinkedList();
		firstName1.add("adinath");
		firstName1.add("adinath1");
		firstName1.add("adinath2");
		firstName1.add("adinath3");
		firstName1.add("adinath4");
		
		
		Object[] b =firstName1.toArray();
		System.out.println(b[3]);
		//--------------------------------------------------------------
		List <String> firstName2 =  new Vector();
		firstName2.add("adinath");
		firstName2.add("adinath1");
		firstName2.add("adinath2");
		firstName2.add("adinath3");
		firstName2.add("adinath4");
		
		Object[] c =firstName2.toArray();
		System.out.println(c[3]);
	
		//------------------------------------------------------
		
		List <String> firstName3 =  new Stack();
		firstName3.add("adinath");
		firstName3.add("adinath1");
		firstName3.add("adinath2");
		firstName3.add("adinath3");
		firstName3.add("adinath4");
		
		Object[] d =firstName3.toArray();
		System.out.println(d[3]);
	//------------------------------------------------------------
			Set <String> firstName4 =  new HashSet();
		firstName4.add("adinath");
		firstName4.add("adinath1");
		firstName4.add("adinath2");
		firstName4.add("adinath3");
		firstName.add("adinath4");
		
		Object[] e =firstName4.toArray();
		System.out.println(e[3]);
		
	//-----------------------------------------------------------
		
		Set <String> firstName5 =  new LinkedHashSet();
		firstName5.add("adinath");
		firstName5.add("adinath1");
		firstName5.add("adinath2");
		firstName5.add("adinath3");
		firstName5.add("adinath4");
		
		Object[] f =firstName5.toArray();
		System.out.println(f[3]);


		
	}
}
