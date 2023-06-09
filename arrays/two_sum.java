package arrays;

import java.util.*;

public class two_sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scn = new Scanner(System.in);
		
		//input array size
		
		System.out.print("Enter array size : ");
		int size = scn.nextInt();
		
		//initializing array 
		
		int [] arr = new int[size];
		
		//taking input from the user
		
		System.out.print("Enter elements of the array : ");
		for (int i = 0; i < arr.length; i++) {
			
			arr[i] = scn.nextInt();
			
		}
		
		//initializing target && taking input from the user
		
		System.out.print("Enter the sum of elements you want : ");
		int target = scn.nextInt();
		
		//calling the function
		
		two_sum(arr , target);

	}
	
	public static int [] two_sum(int [] arr , int target) {
		
		System.out.print("Indexes of the elements of their corroesponding sum are : ");
		
		int [] ans=new int[2];
		
        for(int i=0; i<arr.length; i++){
            
        	for(int j=i+1; j<arr.length; j++){
                
        		if(arr[i]+arr[j]==target){
                    
        			ans[0]=i;
                    ans[1]=j;
                    break;
                }
            }
        }
        return  ans;

	}

}
