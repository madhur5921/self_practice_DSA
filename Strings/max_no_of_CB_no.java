package Strings;

import java.util.*;

public class max_no_of_CB_no {
	
	// what is the CB no according to the question : 
	/*
	 * 0 and 1 are not a CB number.
	 * 2,3,5,7,11,13,17,19,23,29 are CB numbers.
	 * Any number not divisible by the numbers in point 2( Given above) are also CB numbers.
	 
	 * CB number once detected should not be sub-string or super-string of any other CB number.Ex- In 4991, both 499 and 991 are CB numbers but you can choose either 499 or 991, not both.
	 
	 * Further, the CB number formed can only be a sub-string of the string.Ex - In 481, you can not take 41 as CB number because 41 is not a sub-string of 481.*/

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scn = new Scanner(System.in);
		
		//int str = scn.nextInt();
		
		//taking input of string from the user
		
		System.out.print("Enter the string to find max no of CB no : ");
		String st = scn.next();
		
		/*now we will finding out all the possible sub strings of the parent string in the length wise order i.e starting from length 1 substring then length 2 then length 3 & so on so that we can get the max no of CB numbers if we find out the substring in the normal way as we do then that logic will not be able to give us the max no of CB numbers*/
		
		//so now forming then calling the function to find substring in length wise:
		
		//System.out.println("substring in the length wise asscending order : ");
		System.out.print("max no of CB number are : " + length_wise_substring(st));
		

	}
	
	//part 1 of the question : to find out substrings 
	
	public static int length_wise_substring(String st) {
		
		int count = 0; // to count the no of CB numbers
		boolean [] visited = new boolean[st.length()];
		
		/*in this we will form 2 loops one which iterates through the length of the substring & second which will find the substring & print them*/
		
		for (int length = 1; length <= st.length() ; length++) { 
			
			//will maintain the length of the substring
			
			for (int starting_index = 0; starting_index <= st.length() - length; starting_index++) { 
				
				/*so here in this substrings in length wise are form in such a way that there is a relation bw starting index , length & ending index i.e ending index = starting index + length*/
				
				int ending_index = starting_index + length;
				String s = st.substring(starting_index, ending_index);
				//System.out.println(s); // to print the substrings
				
				//Long.parseLong(s);//to convert string to long data type
				
				if(isCBno(Long.parseLong(s)) == true && isvisited(visited , starting_index , ending_index - 1) == false) {
					
					for (int i = starting_index; i <= ending_index - 1; i++) {
						
						//this loop sets the true value to those elements which are visited
						visited[i] =  true;
						
					}
					
					count++;
				}
				
			}
			
		}
		
		return count;
	}
	
	//part 2 of the question : to check the substrings are CB number or not
	
	public static boolean isCBno(long n) {
		
		int arr [] = {2,3,5,7,11,13,17,19,23,29};
		
		// now applying all conditions : 
		
		//condition 1 :
		
		if(n == 0 || n == 1) {
			
			return false; // not cb number
		}
		
		//condition 2
		
		for (int i = 0; i < arr.length; i++) {
			
			if(arr[i] == n) {
				
				return true; // that element is CB number 
			}
			
		}
		
		//condition 3
		
		for (int i = 0; i < arr.length; i++) {
			
			if(n % arr[i] == 0) {
				
				return false; // not CB number
			}
			
		}
		
		//any other conditions except listed above
		
		return true; // then it is CB number
	}
	
	/*part 3 of the question : to remove the duplicates substrings or those substrings which are already count && not to be included again*/
	
	public static boolean isvisited(boolean[] visited , int starting_index , int ending_index) {
		
		for (int i = starting_index; i <= ending_index; i++) {
			
			if(visited[i] == true) {
				
				return true; // it is a CB number
			}
		}
		
		return false; //else if it comes out of the loop then it is not a CB number
	}

}
