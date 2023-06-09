package arrays;

import java.util.*;

public class How_many_times_did_you_see_Ali {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scn = new Scanner(System.in);
		
		//array size
		
		System.out.print("Enter size of an array : ");
		int size = scn.nextInt();
		
		//initializing array
		
		int [] arr = new int[size];
		
		//taking input from user
		
		System.out.print("Enter elements in the array : ");
		for (int i = 0; i < arr.length; i++) {
			
			arr[i] = scn.nextInt();
			
		}
		
		//to find how many times that element come in array
		
		System.out.print("Enter the element to find about it : ");
		int target = scn.nextInt();
		
		//calling the function
		
		how_many_times(arr , target);

	}
	
	public static void  how_many_times(int [] arr, int target) {
		
		int count = 0;// to maintain the count of a particular element
		
		for (int i = 0; i < arr.length; i++) {
			
			if(arr[i] == target) {
				
				count++;
			}
			
		}
		
		System.out.print("no of times " + target + " appears in the array is : " + count);
		//return count;
	}

}
