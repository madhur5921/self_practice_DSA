package wrapper_class;

import java.util.*;

public class Intro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Integer a = 100; // wrapper class of int
		int A = 10;
		
		Short b = 78; // wrapper class of short
		Byte c = 19; // wrapper class of byte
		
		System.out.println(a);
		System.out.println(A);
		System.out.println(b);
		System.out.println(c);
		
		// wrapper class only show or gives the value/content store in it not the address of that content & it get stored in heap. Primitive data type have their respective wrapper classes non primitive not & they are stored in stack.
		
		a = A;// when we stored the primitive data type value in the wrapper class it is known as autoboxing. 
		System.out.println(a); // & now the new value of the a will be stored in the heap only.
		
		Integer D = 100; // wrapper class
		int d = 10;
		d = D; // when we stored the wrapper class value in its respective primitive data type is called onboxing.
		System.out.println(d);
		
		Integer e = 19;
		Integer f = 19;
		System.out.println(e == f); // == compares the address
		
		Integer g = 190;
		Integer h = 190;
		System.out.println(g == h);
		
		// so in these 2 cases first one is true & second one is false because there is Integer Cache which says that if the value lie between -128 to 127 then it will not allow to create duplicates values & thus have the same address but if value is out of the range then they are stored in different addresses && integer , long , short have the same range.
		
		

	}

}
