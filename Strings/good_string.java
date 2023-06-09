package Strings;

import java.util.*;

public class good_string { 
	
	// so a good string is a sub string of the original string which have vowels present in it in a continous manner
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scn = new Scanner(System.in);
		
		//taking string input from the user
		
		System.out.print("Enter the string : ");
		String st = scn.next();
		
		//calling the function && printing the largest length of the good string
		
		System.out.print("Length of the longest good string in " + st + " is : " + goodstring(st));

	}
	
	public static int goodstring(String st) {
		
		int ans = 0; 
		int count = 0;
		
		// so here we have initialize 2 integers vabibles 1 store the value of ans in it && other will count the continous vowel present in the string
		
		for (int i = 0; i < st.length(); i++) {
			
			char ch = st.charAt(i);
			
			if(check_vowels(ch) == true) {
				
				count++;
			}
			
			else {
				
				ans = Math.max(ans, count);
				count = 0;
			}
			
		}
		
		ans = Math.max(ans, count);
		return ans;
		
	}
	
	public static boolean check_vowels(char ch) {
		
		// this function we have made to tell the which all characters are vowel
		
		if(ch == 'a' || ch == 'A' || ch == 'e' || ch == 'E' || ch == 'i' || ch == 'I' || ch == 'o' || ch == 'O' || ch == 'u' || ch == 'U') {
			
			return true;
		}
		
		else {
			
			return false;
		}
	}

}
