package Strings;
import java.util.*;

public class Basics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//initializing && assigning string 
		//str && str1 are both stored in the same address. they both are created inside the heap
		
		String str = "hello";  
		String str1 = "hello";
		
		System.out.println(str);
		
		// another way of implementing string && it is same as above . here by using new keyword we are storing it in the different address i.e st && st1 are stored in different address && also they are created inside the string pool which is inside the heap
		
		String st = new String("hello"); 
		
		String st1 = new String("hello");
		
		System.out.println(st1);
		
		// concatening string or combining strings
		
		str = str + "bye"; 
		st1 = st1 + "bye";
		
		System.out.println(str);
		
		//function use to calculate total length of the particular string
		
		System.out.println(str.length()); 
		
		// comparing addresses of strings
		
		System.out.println("address of st & st1 : " + st == st1);
	System.out.println("address of str & str1 : " + str == str1);
	System.out.println("address of str & st : " + str == st);
		
	// comparing content of strings	
	
	System.out.println(st1.equals(st));
	
	//to check which value is present on a given index
	
	System.out.println(str.charAt(3));
	
	//to form substring from the main string
	
	String sub = str.substring(0, 3);
	
	System.out.println(sub);
	
	//to combine / merge / add strings
	
	System.out.println(str.concat(sub));
	
	}

}
