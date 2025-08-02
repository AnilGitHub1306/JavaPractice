package collection;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;
import java.util.Vector;
public class addingTwoOrMoreArraylist {

	public static void main(String[] args) 
	{
	/*	List <String> firstName =  new ArrayList();
		firstName.add("adinath");
		firstName.add("adinath1");
		firstName.add("adinath2");
		firstName.add("adinath3");
		firstName.add("adinath4");
		
		List <String> lastName =  new ArrayList();
		lastName.add("Sam");
		lastName.add("Sam1");
		lastName.add("Sam2");
		lastName.add("Sam3");
		lastName.add("Sam4");
		
		firstName.addAll(lastName);
		System.out.println(firstName);*/
	//-------------------------------------------------------------	
		
	/*	List <String> firstName =  new LinkedList();
		firstName.add("adinath");
		firstName.add("adinath1");
		firstName.add("adinath2");
		firstName.add("adinath3");
		firstName.add("adinath4");
		
		List <String> lastName =  new LinkedList();
		lastName.add("Sam");
		lastName.add("Sam1");
		lastName.add("Sam2");
		lastName.add("Sam3");
		lastName.add("Sam4");
		
		firstName.addAll(lastName);
		System.out.println(firstName);*/
	//-----------------------------------------------------------
		
	/*  List <String> firstName =  new Vector();
		firstName.add("adinath");
		firstName.add("adinath1");
		firstName.add("adinath2");
		firstName.add("adinath3");
		firstName.add("adinath4");
		
		List <String> lastName =  new Vector();
		lastName.add("Sam");
		lastName.add("Sam1");
		lastName.add("Sam2");
		lastName.add("Sam3");
		lastName.add("Sam4");
		
		firstName.addAll(lastName);
		System.out.println(firstName);*/
	
		//------------------------------------------------------
		
		List <String> firstName =  new Stack();
		firstName.add("adinath");
		firstName.add("adinath1");
		firstName.add("adinath2");
		firstName.add("adinath3");
		firstName.add("adinath4");
		
		List <String> lastName =  new Stack();
		lastName.add("Sam");
		lastName.add("Sam1");
		lastName.add("Sam2");
		lastName.add("Sam3");
		lastName.add("Sam4");
		
		 
		
		firstName.addAll(lastName);
		System.out.println(firstName);
		
		
		
	}
}
