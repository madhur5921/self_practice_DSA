package Two_D_Array;
import java.util.*;

public class staircase_search {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scn = new Scanner(System.in);
		
		//initializing rows size
		
		System.out.print("enter row size : ");
		int r = scn.nextInt();
		
		//initializing column size
		
		System.out.print("enter column size : ");
		int c = scn.nextInt();
		
		//initializing array
		
		int [] [] arr = new int [r] [c];
		
		//calling input function
		
		input(arr);
		
		//input of searching element
		
		System.out.print("enter element to be searched : ");
		int ele = scn.nextInt();
		
		//calling search function & assigning to ans 
		
		int ans  = search(arr , ele);
		
		//printing ans
		
		System.out.println(ans);

	}
	
	public static void input(int [] [] arr) {
		
		Scanner sc = new Scanner(System.in);
		
		for (int row = 0; row < arr.length; row++){ //loop for row elements
			
			System.out.print("enter " + row + " row elements : ");
			
			for (int col = 0; col < arr[0].length; col++){ // loop for column elements
				
				arr[row] [col] = sc.nextInt();
				
			}
			
		}
	}
	
	public static int search(int [] [] arr , int x) {
		
		//initializing current position from where the search need to be start 
		
		int row = 0;
		int col = arr[0].length - 1;
		
		while(col >= 0 && row < arr.length) {//as our starting point will be corner one && we can only choose either top right most point or bottom left most point to start searching the element && in this one we have choose top right most point && most imp this logic only works when array is sorted
			
			if(arr [row] [col] == x) {
				
				return 1;
			}
			
			else if(arr [row] [col] < x) {
				
				row++;
			}
			
			else { // condition = arr [row] [col] > x
				
				col--;
			}
			
			}
		return 0; 
	}

}
