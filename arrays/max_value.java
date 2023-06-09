package arrays;

import java.util.Scanner;

public class max_value {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
Scanner scn = new Scanner(System.in);
		
		//size of an array
		System.out.println("enter size");
		int n = scn.nextInt();
		int [] arr = new int[n];
		
		//taking input
		System.out.println("enter elements");
		for (int i = 0; i < arr.length; i++) {
			 arr[i] = scn.nextInt();
			}
		
		System.out.println("max value");
		System.out.println(Maximum(arr));

		
		
	}
	
	public static int Maximum(int [] arr) {
		
		int max = arr[0];
		
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] > max) {
				
				 max = arr[i];
			}
		}
		return max;


	}

}
