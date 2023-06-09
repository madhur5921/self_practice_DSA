package binary_search;
import java.util.*;

public class Binary_Search {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scn = new Scanner(System.in);
		
		//defining array size
		
		System.out.print("Enter array size : ");
		
		int n = scn.nextInt();
		
		//initializing array
		
		int [] arr = new int[n];
		
		//taking input from user (array elements)
		
		System.out.print("Enter elements : ");
		
		for (int i = 0; i < arr.length; i++) {
			
			arr[i] = scn.nextInt();
			
		}
		
		//calling function
		
		System.out.print("Enter element to be searched : ");
		
		int element = scn.nextInt();
		
		int ans = binary_search(arr , element);
		
		//printing final ans
		
		System.out.print("Index of searched item : " + ans);

	}
	
	public static int binary_search(int [] arr , int element) {
		
		int m = arr.length;
		int low_index = 0;
		int high_index = m - 1;
		
		while(low_index <= high_index) {
			
			int mid = (low_index + high_index) / 2;
			
			if(arr[mid] == element) {
				
				return mid;
			}
			
			else if(arr[mid] > element) {
				
				high_index = mid - 1;
			}
			
			else { // condition : arr[mid] < element
				
				low_index = mid + 1;
			}
		}
		
		return -1;
	}

}
