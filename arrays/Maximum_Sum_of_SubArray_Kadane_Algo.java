package arrays;
import java.util.*;

public class Maximum_Sum_of_SubArray_Kadane_Algo {

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
		
		int ans = Integer.MIN_VALUE;
		
		int initial_sum = 0;
		
		for (int i = 0; i < arr.length; i++) {
			
			initial_sum = initial_sum + arr[i];
			ans = Math.max(ans , initial_sum);
			
			if(initial_sum < 0) {
				
				initial_sum = 0;
			}
		}
		
		return ans;
	}


	}


