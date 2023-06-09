package arrays;

import java.util.*;

public class linear_search {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scn = new Scanner(System.in);
		
		//size of array
		
		System.out.println("size ?");
		int n = scn.nextInt();
		
		// array initialize
		
		int [] arr = new int[n];
		
		// taking input
		
		System.out.println("input elements: ");
		for (int i = 0; i < arr.length; i++) {
			
			arr[i] = scn.nextInt();
			
		}
		
		//element to be search
		
		System.out.println("element to be search ?");
		int element = scn.nextInt();
		System.out.println(linearsearch(arr , element));

	}
	
	public static int linearsearch(int [] arr , int element) {
		
		for (int i = 0; i < arr.length; i++) {
			
			if(arr[i] == element) {
				
				System.out.println("index of element: ");
				return i;
			}
		}
		
		System.out.println("element not found in array 😥 ");
		return -1;
	}

}
