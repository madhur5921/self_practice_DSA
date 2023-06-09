package arrays;

import java.util.*;

public class reverse_array_method_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scn = new Scanner(System.in);
		
		//array size
		
		System.out.println("array size ?");
		int n = scn.nextInt();
		
		//array initialize
		
		int [] arr = new int[n];
		
		//taking input
		
		System.out.println("enter elements :");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scn.nextInt();
		}
		
		//reversing array
		
		Reverse(arr);
		
		// printing revere array
		
		System.out.println("reverse array :");
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}

	}
	
	public static void Reverse(int [] arr) {
		int i = 0;
		int j = arr.length - 1;
		while(i < j) {
			
			int a = arr[i];
			arr[i] = arr[j];
			arr[j] = a;
			
			i++;
			j--;
		}
		
	}

}
