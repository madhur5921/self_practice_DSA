package Two_D_Array;
import java.util.*;

public class jagged_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scn = new Scanner(System.in);
		
		//initialize row size
		
		System.out.print("Enter row size : ");
		int n = scn.nextInt();
		
		//initialize 2d array
		
		int [] [] arr = new int [n] [];
		
		//taking input
		
		for (int i = 0; i < n; i++) { // loop for taking input in the row
			
			System.out.print("enter column size for " + i + " row : ");
			int m  = scn.nextInt();
			
			
			
			//initializing size of id array of respective row
			
			
			arr[i] = new int[m];
			
			
			
			for (int j = 0; j < m; j++) { // loop for taking input in the column 
				
				arr[i] [j] = scn.nextInt();
				
			}
			
		}
		
		// printing the jagged array
		
		System.out.println("elements of jagged array are : ");
		
		for (int i = 0; i < n; i++) { //printing rows elements
			
			for (int j = 0; j < arr[i].length ; j++) { // printing column elements
				
				System.out.print(arr[i] [j] + " ");
				
			}
			
			System.out.println();
			
		}

	}

}
