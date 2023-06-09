package sorting;

import java.util.*;

public class Bubble_Sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scn = new Scanner(System.in);
		
		//enter size
		
		System.out.println("array size?");
		int n = scn.nextInt();
		
		//array initialize
		
		int [] arr = new int[n];
		
		//input elements
		
		System.out.println("enter elements :");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scn.nextInt();
		}
		
		//sorting the input array
		
		Sort(arr);
		
		//printing the sorted array
		
		System.out.println("sorted array :");
		for (int i = 0; i < arr.length; i++){
			System.out.print(arr[i] + " ");
		}

	}
	
	public static void Sort(int [] arr) {
		
		for (int turn = 1; turn < arr.length; turn++){
			
			for (int i = 0; i < arr.length - turn; i++){
				
				if(arr[i] > arr[i + 1]) {
					
					//swapping the elements
					
					int a = arr[i];
					arr[i] = arr[i + 1];
					arr[i + 1] = a;
				}
				
			}
			
		}
	}

}
