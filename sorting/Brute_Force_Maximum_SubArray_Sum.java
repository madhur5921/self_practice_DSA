package sorting;
import java.util.*;

public class Brute_Force_Maximum_SubArray_Sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scn = new Scanner(System.in);
		
		//defining array size
		
		System.out.print("Enter array size : ");
		int n = scn.nextInt();
		
		//initializing array 
		
		int [] arr = new int[n];
		
		//taking input from user(elements for array)
		
		System.out.print("Enter elements : ");
		
		for (int i = 0; i < arr.length; i++) {
			
			arr[i] = scn.nextInt();
		}
		
		//calling function
		
		int max_sum = maxsum(arr);
		
		//printing final ans
		
		System.out.print("Maximum Sum of Sub Array : " + max_sum);

	}
	
	public static int maxsum(int [] arr) {
		
		//defining min integer value ( -2 ^ 31) 
		
		int ans = Integer.MIN_VALUE;
		
		//first loop to form sub array from array
		
		for (int i = 0; i < arr.length; i++) {
			
			int initial_sum = 0;
			
			//second loop for performing addition in subarrays
			
			for (int j = i; j < arr.length; j++) {
				
				initial_sum = initial_sum + arr[j];
				
				//taking out maximum sum from sum of subarrays
				
				 ans = Math.max( ans , initial_sum ); 
				
			}
			
		}
		
		return ans;
	}

}
