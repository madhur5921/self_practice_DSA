package Two_D_Array;
import java.util.*;

public class vertical_wave{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scn = new Scanner(System.in);
		
		//defining now of rows
		
		System.out.print("enter no of rows : ");
		int r = scn.nextInt();
		
		//defining no of columns
		
		System.out.print("enter no of columns : ");
		int c = scn.nextInt();
		
		//initializing the array
		
		int [] [] arr = new int [r] [c];
		
		//taking input from the user
		
		for (int i = 0; i < arr.length; i++){ // loop for entering row elements
			
			System.out.print("enter row " + i + " elements : ");
			
			for (int j = 0; j < arr[0].length; j++){ // loop for entering column elements
				
				arr [i] [j] = scn.nextInt();
				
			}
			
		}
		
		//calling the function
		
		print(arr);

	}
	
	public static void print(int [] [] arr) {
		
		for (int col = 0; col < arr[0].length; col++){ //as column value is fix & row value is changing 
			
			if(col % 2 == 0) {
				
				for (int row = 0; row < arr.length; row++){//as in the question we need to print vertical manner & according to question column value is fix & row value is changing
					
					System.out.print(arr [row] [col] + " ");
					
					}
				
				System.out.print(" | ");
			}
			
			else {
				
				for (int row = arr.length - 1; row >= 0; row--){
					
					System.out.print(arr [row] [col] + " ");
					
				}
				
				System.out.print(" | ");
			}
		}
	}

}
