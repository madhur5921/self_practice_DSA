package sorting;
import java.util.*;

public class Area_Of_Rain_Water_Trapp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scn = new Scanner(System.in);
		
		//defining array size
		
		System.out.print("Enter Array Size : ");
		int n = scn.nextInt();
		
		//initializing array
		
		int [] arr = new int[n];
		
		//taking input from user (elements of array)
		
		System.out.print("Enter Elements : ");
		
		for (int i = 0; i < arr.length; i++) {
			
			arr[i] = scn.nextInt();
		}
		
		//calling function
		
		int area = rainwatertrapping(arr);
		
		//final ans
		
		System.out.print("Area of rain water trapp : " + area);

	}
	
	public static int rainwatertrapping(int [] arr) {
		
		//defining general length of array
		
		int m = arr.length;
		
		//initializing left array or array for traversing from left block
		
		int [] left = new int [m];
		
		//calculating max height of the left block wrt each block
		
		left[0] = arr[0];
		
		for (int i = 1; i < m; i++) {
			
			left[i] = Math.max( left[i - 1] , arr[i] );
			
			}
		
		//initializing right array or array for traversing from right block
		
		int [] right = new int [m];
		
		//calculating max height of the right block wrt each block
		
		right[m - 1] = arr[m - 1];
		
		for (int i = m - 2; i >= 0; i--) {
			
			right[i] = Math.max( right[i + 1] , arr[i] );
			
		}
		
		//final ans
		
		int ans = 0;
		
		for (int i = 0; i < m; i++) {
			
			//comparing min values bw left block & right block array
			
			int min = Math.min( left[i] , right[i] );
			
			//area of each rain water trap block
			
			int area = min - arr[i];
			
			//adding the area of each rain water trap block
			
			ans = ans + area;
			
		}
		
		return ans;
	}

}
