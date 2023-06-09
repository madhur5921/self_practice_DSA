package arrays;

import java.util.*;

public class First_and_Last_Position_of_Element_in_Sorted_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scn = new Scanner(System.in);
		
		//array size
		
		System.out.print("enter the array size : ");
		int size = scn.nextInt();
		
		//initializing the array
		
		int [] arr = new int[size];
		
		//taking input from user
		
		System.out.print("enter the elements in the array : ");
		for (int i = 0; i < arr.length; i++) {
			
			arr[i] = scn.nextInt();
			
			}
		
		//initializing the target 
		
		System.out.print("enter the element for which indexes need to find : ");
		int target = scn.nextInt();
		
		//calling the function
		
		System.out.print("indexes of the target are : ");
		find(arr , target);
		
		

	}
	
	public static int [] find(int [] arr , int target) {
		
		//sorting the array
		
		Arrays.sort(arr);
		
		//creating a new array to store the target indexes
		
		int [] ans = new int[2];
		
		//traversing the array from left to right
		
		for (int i = 0; i < arr.length; i++) {
			
			if(arr[i] == target) {
				
				ans[0] = i;
				ans[1] = i + 1;
				
				}
			
		}
		
		return ans;
		
		//if(arr[i] != target) {
			
			
		//}
	}

}
