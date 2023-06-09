package arrays;

import java.util.*;

public class rotate_array {

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
		
		//for multiple rotation
		
		for (int j = 1; j <= k; j++) {
			
		//for 1 rotation
		
		int a  = arr[arr.length - 1];
		for (int i = arr.length - 2; i >= 0; i--){
			
			arr[i + 1] = arr[i];
			}
		
		arr[0] = a;
		
		}
		}

}
