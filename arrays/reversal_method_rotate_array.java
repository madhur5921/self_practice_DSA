package arrays;

import java.util.*;

public class reversal_method_rotate_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
Scanner scn  = new Scanner(System.in);
		
		//array size
		
		System.out.println("array size ?");
		int n = scn.nextInt();
		
		//array initialize
		
		int [] arr = new int[n];
		
		//input elements
		
		System.out.println("input elements :");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scn.nextInt();
			}
		
		//rotating the array
				//input rotations to give to an array
				
				System.out.println("input rotation to give to an array");
				int k = scn.nextInt();
				
				RotateArray(arr , k);
				
				//printing the rotate array
				
				System.out.println("rotated array :");
				for (int i = 0; i < arr.length; i++) {
					
					System.out.println(arr[i]);
				}

	}
	
	public static void RotateArray(int [] arr , int k) {
	
		k = k % arr.length;
	int n = arr.length;
	
	Reverse(arr , 0 , n - k -1);//reversing first n - k elements
	Reverse(arr , n - k , n -1);//reversing  k elements
	Reverse(arr , 0 , n - 1);//reversing array
	
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
