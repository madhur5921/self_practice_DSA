package Strings;

import java.util.*;

public class print_substring {

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
		//2nd loop for iterating till ending index
		
		// 1st loop
		
		for (int i = 0; i < st.length(); i++) {
			
			System.out.print(i + 1 + " pair of substring : ");
			
			// 2nd loop
			
			for (int j = i + 1; j <= st.length(); j++) {
				
				System.out.print(st.substring(i, j) + " | ");
				
				
			}
			
			System.out.println();
			
		}
	}

}
