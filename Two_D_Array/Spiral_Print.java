package Two_D_Array;
import java.util.*;

public class Spiral_Print {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scn = new Scanner(System.in);
		
		//initializing row size:
		
		System.out.print("Enter row size : ");
		int r = scn.nextInt();
		
		//initializing column size
		
		System.out.print("Enter column size : ");
		int c = scn.nextInt();
		
		//defining array
		
		int [] [] arr = new int [r] [c];
		
		//calling input function
		
		input(arr);
		
		System.out.println();
		
		//calling printing function
		
		System.out.println("Elements in spiral form : ");
		spiral_print(arr);

	}
	
	public static void input(int [] [] arr) {
		
		Scanner sc = new Scanner(System.in);
		
		for (int row = 0; row < arr.length; row++) { // loop for input row elements
			
			System.out.print("Enter row " + row + " elements : ");
			
			for (int col = 0; col < arr[0].length; col++) { //loop for input column elements
				
				arr [row] [col] = sc.nextInt(); 
				
			}
			
		}
	}
	
	public static void spiral_print(int [] [] arr) {
		
		//initializing minimum row , maximum row , minimum column & maximum column
		
		int minr = 0;
		int minc = 0;
		int maxr = arr.length - 1;
		int maxc = arr[0].length - 1;
		
		//initializing total no of elements in the array
		
		int total_ele = arr.length * arr[0].length;
		
		//initializing a variable to count the elements that has been printed
		
		int count = 0;
		
		while(count < total_ele) {
			
			//loop for printing minimum row elements i.e row is fixed & column is varying
			
			for (int i = minc; i <= maxc; i++) {
				
				System.out.print(arr [minr] [i] + " ");
				count++;
				
			}
			
			minr++; //changing the row 
			
			//loop for printing maximum column elements i.e column is fixed & row is varying
			
			for (int j = minr; j <= maxr; j++) {
				
				System.out.print(arr [j] [maxr] + " ");
				count++;
				
			}
			
			maxc--;
			
			//loop for printing maximum row elements i.e row is fixed & column is varying
			
			for (int k = maxc; k >= minc ; k--) {
				
				System.out.print(arr [maxr] [k] + " ");
				count++;
				
			}
			
			maxr--;
			
			//loop for printing minimum column elements i.e column is fixed & row is varying
			
			for (int l = maxr; l >= minr; l--) {
				
				System.out.print(arr [l] [minc] + " ");
				count++;
				
			}
			
			minc++;
		}
	} 

}
