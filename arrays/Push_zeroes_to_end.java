package arrays;

import java.util.*;

public class Push_zeroes_to_end {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scn  = new Scanner(System.in);
		
		//array size
		
		System.out.print("Enter array size : ");
		int size = scn.nextInt();
		
		//initializing array
		
		int [] arr = new int[size];
		
		//input of elements from user
		
		System.out.print("Enter elements in the array : ");
		for (int i = 0; i < arr.length; i++) {
			
			arr[i] = scn.nextInt();
			
		}
		
		//traversing the array from left to right 
		int j = 0;
		
		for (int i = 0; i < arr.length; i++) {
			
			if(arr[i] != 0) {
				
				//calling the function to swap the values
				
				swap(arr, j , i);
				j++;
			}
			
		}
		
		//printing the array
		
		System.out.print("Final Output : ");
		for (int i = 0; i < arr.length; i++) {
			
			System.out.print(arr[i] + " ");
		}
		
		}
	
	public static void swap(int [] arr , int a , int b) {
		
				
				int c = arr[a];
				arr[a] = arr[b];
				arr[b] = c;
			
	}
	
	}


