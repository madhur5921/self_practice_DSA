package arrays;

import java.util.*;

public class reverse_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scn = new Scanner(System.in);
		
		//size
		
		System.out.println("Size 🙄 ?");
		int n = scn.nextInt();
		
		//array initialize
		
		int [] arr = new int [n];
		
		//taking input
		System.out.println("input elements : ");
        for (int i = n - 1; i >= 0; i--) {
			
        	arr[i] = scn.nextInt();
		}
        
        System.out.println("reverse array : ");
        System.out.println(Arrays.toString(arr));

	}
	

}

