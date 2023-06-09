package sorting;

import java.util.*;

public class Selection_Sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scn = new Scanner (System.in);
		
		//array size
		
		System.out.println("enter array size :");
		int n = scn.nextInt();
		
		//initialize array
		
		int [] arr = new int[n];
		
		//input elements
		
		System.out.println("enter elements :");
		
		for (int i = 0; i < arr.length; i++){
			arr[i] = scn.nextInt();
		}
		
		//sorting the elements in array
		
		Sort(arr);
		
		//printing the sorted array
		
		System.out.println("Sorted array is :");
		
		for (int i = 0; i < arr.length; i++){
			System.out.print(arr[i] + " ");
		}

	}
	
	public static void Sort(int [] arr) {
		
		for (int i = 0; i < arr.length; i++){
			
			//defining the minimum index
			
			int min_index = i;
			
			for (int j = i + 1; j < arr.length; j++){
				
				if(arr[j] < arr[min_index]) {
					min_index = j;
				}
			}
			
			//swapping the values
			
			int a = arr[i];
			arr[i] = arr[min_index];
			arr[min_index] = a;
		}
	}

}
