package sorting;

import java.util.*;

public class Insertion_sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//taking input from user
		
		Scanner scn = new Scanner(System.in);
		
		//input array size
		
		System.out.print("enter array size : ");
		int n = scn.nextInt();
		
		//initializing array
		
		int [] arr = new int[n];
		
		// input array elements
		
		System.out.print("enter elements : ");
		
		for (int i = 0; i < arr.length; i++) {
			
			arr[i] = scn.nextInt();
		}
		
		//sorting array
		
		sort(arr);
		
		//printing sorted array
		
		System.out.print("sorted array : ");
		
		for (int i = 0; i < arr.length; i++) {
			
			System.out.print(arr[i] + " ");
		}
		
		}
	
	public static void sort(int [] arr) {
		
		for (int i = 1; i < arr.length; i++){
			
			int j = i - 1;
			int item = arr[i];
			
			while(j >= 0 && arr[j] > item) {
				
				arr[j + 1] = arr[j];
				j--;
			}
			
			j++;
			arr[j] = item;
		}
	}

}
