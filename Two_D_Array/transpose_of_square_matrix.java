package Two_D_Array;
import java.util.*;

public class transpose_of_square_matrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scn = new Scanner(System.in);
		
		//initializing square matrix
		
		System.out.print("enter size of square matrix : ");
		int n = scn.nextInt(); //same no of rows & columns as it is a square matrix
		
		// initializing array
		
		int [] [] arr = new int [n] [n];
		
		//taking input from user
		
		for (int row = 0; row < arr.length; row++){
			
			System.out.print("enter " + row + " row elements : ");
			
			for (int col = 0; col < arr.length; col++){ // we can take arr.length as well as arr[0].length as it is a square matrix
				
				arr[row] [col] = scn.nextInt();
				
			}
			
		}
		
		//calling the function
		
		transpose(arr);
		
		//calling the printing function of the transpose array
		
		print(arr);

	}
	
	public static void transpose(int [] [] arr) {
		
		for (int row = 0; row < arr.length; row++){
			
			for (int col = row + 1; col < arr.length; col++){//we are diagonally swapping the values in the arrays so i.e why column value will start from row + 1
				
				int a = arr[row] [col];
				arr[row] [col] = arr [col] [row];
				arr[col] [row] = a;
				
			}
			
		}
	}
	
	public static void print(int [] [] arr) {
		
		System.out.println("transpose array elements are : ");
		System.out.println();
		
		for (int row = 0; row < arr.length; row++) {
			
			for (int col = 0; col < arr.length; col++){
				
				System.out.print(arr [row] [col] + "  ");
				
			}
			
			System.out.println();
			
		}
	}

}
