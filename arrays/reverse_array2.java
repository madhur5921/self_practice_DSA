package arrays;

import java.util.*;

public class reverse_array2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scn  = new Scanner(System.in);
		
		//size of array
		
		System.out.println("size of array ? ");
		int n = scn.nextInt();
		
		//initialize array
		
		int [] arr = new int[n];
		
		//taking input
		
		System.out.println("enter elements :");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scn.nextInt();
		}
		
		//defining range of array to be swap
		
		System.out.println("define range of array to swap :");
		System.out.println("enter starting index :");
		int a = scn.nextInt();
		System.out.println("enter ending index :");
		int b = scn.nextInt();
		
		//reversing the array
		
		Reverse(arr , a , b);
		
		//printing the array
		
		System.out.println("reverse array within the range :");
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}

	}
	
	public static void Reverse(int [] arr , int a , int b) {
		
		while(a < b) {
		
			int c = arr[a];
		arr[a] = arr[b];
		arr[b] = c;
		
		a++;
		b--;
		
		}
	}

}
