package Two_D_Array;
import java.util.*;

public class input_output {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scn = new Scanner(System.in);
		
		//initializing rows & columns 
		
		System.out.print("enter no of rows : ");
		int n = scn.nextInt();//rows
		
		System.out.print("enter no of columns : ");
		int m  = scn.nextInt();//columns
		//defining array
		
		
		int [] [] arr = new int [n] [m];
		
		//taking input 
		
		for (int i = 0; i < n; i++) { // loop for rows
			
			System.out.print("Enter" + " "  + i + " " + "row elements : ");
			
			for (int j = 0; j < m; j++) { // loop for columns
				
				
				arr [i] [j] = scn.nextInt();
				
			}
			
		}
		
		//printing output
		
		System.out.println("elements of array are : ");
		
		for (int i = 0; i < n; i++) { // printing rows
			
			for (int j = 0; j < m; j++) { // columns
				
				System.out.print(arr [i] [j] + " ");
				
			}
			
			System.out.println();
			
		}
		
		}

}
