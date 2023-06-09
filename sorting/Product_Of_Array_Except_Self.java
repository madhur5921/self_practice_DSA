package sorting;
import java.util.*;

public class Product_Of_Array_Except_Self {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		
		//defining size of array
		
		System.out.print("Size of array ? : ");
		int n = scn.nextInt();
		
		//array initialize
		
		int [] arr = new int[n];
		
		//taking input from user
		
		System.out.print("Input Elements : ");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scn.nextInt();
		}
		
		//printing final ans (array consist product of index)
		
		System.out.print("Resulted Array is : ");
		
		int [] ans = product(arr);
		
		for (int i = 0; i < arr.length; i++) {
			
			System.out.print(ans[i] + " ");
		}

	}
	
	public static int[] product(int arr[]) {
		
		//defining array size
		int m = arr.length;
		
		//initializing left array
		
		int [] left = new int[m];
		
		left[0] = 1;
		
		for (int i = 1; i < m; i++) {
			
			left[i] = left[i - 1] * arr[i - 1];
		}
		
		//initializing right array 
		
		int [] right = new int[m];
		
		right[m - 1] = 1;
		
		for (int i = m - 2; i >= 0; i--) {
			
			right[i] = right[i + 1] * arr[i + 1];
		}
		
		for (int i = 0; i < m; i++) {
			
			arr[i] = left[i] * right[i];
		}
		
	return arr;	
		
	}

}
