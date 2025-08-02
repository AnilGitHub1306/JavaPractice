package collection;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class addingTwoOMoreSet {

	public static void main(String[] args) 
	{
	/*	Set <String> firstName =  new HashSet();
		firstName.add("adinath");
		firstName.add("adinath1");
		firstName.add("adinath2");
		firstName.add("adinath3");
		firstName.add("adinath4");
		
		Set <String> lastName =  new HashSet();
		lastName.add("Sam");
		lastName.add("Sam1");
		lastName.add("Sam2");
		lastName.add("Sam3");
		lastName.add("Sam4");
		
		firstName.addAll(lastName);
		System.out.println(firstName); */
		
	//-----------------------------------------------------------
		
		Set <String> firstName =  new LinkedHashSet();
		firstName.add("adinath");
		firstName.add("adinath1");
		firstName.add("adinath2");
		firstName.add("adinath3");
		firstName.add("adinath4");
		
		Set <String> lastName =  new LinkedHashSet();
		lastName.add("Sam");
		lastName.add("Sam1");
		lastName.add("Sam2");
		lastName.add("Sam3");
		lastName.add("Sam4");
		
		firstName.addAll(lastName);
		System.out.println(firstName);


	}

}
