package Strings;

import java.util.*;

public class palindrome_substring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
Scanner scn = new Scanner(System.in);
		
		//taking input of the string
		
		System.out.print("Enter the string : ");
		String st = scn.nextLine();
		System.out.println();
		
		//calling function
		
		substring(st);
		
	}
	
public static void substring(String st) {
		
		// 2 loops will be use
		// 1st loop for iterating starting index
		//2nd loop for iterating ending index
		
		// 1st loop
	
	System.out.println("the palindrome substring are : ");
		
		for (int i = 0; i < st.length(); i++) {
			
			
			// 2nd loop
			
			for (int j = i + 1; j <= st.length(); j++) {
				
				
				String str  = (st.substring(i, j));
				
				if(palindrome(str)) { // checking that the substring is palindrome or not 
					
					System.out.print(str + " | ");
				}
				
				}
			
		}
		
}

public static boolean palindrome(String st) {
	
	//we will apply the 2 pointer approach in it will compare the string letters from starting index && ending index if they match then we compare the next 2 letters from start && end && when same letter come at some point then it is a palindrome 
	
	int i = 0;
	int j = st.length() - 1;
	
	//loop is used to compare the letters in the string 
	
	while(i < j) {
		
		if (st.charAt(i) != st.charAt(j)) {
			
			return false;
		}
		
		// if they are equal 
		
		i++;
		j--;
	}
	
	return true;
}

}
