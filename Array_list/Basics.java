package Array_list;

import java.util.*;

public class Basics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Syntax of array list
		
		ArrayList<Integer>list = new ArrayList<>();
		System.out.println(list);
		
		// to add elements in the list
		
		list.add(10); // add function is used
		list.add(20);
		System.out.println(list);
		
		// to add element at a particular index
		
		list.add(0 , 30);// in this range of the index will be from 0 to the current size of the list
		System.out.println(list);
		
		// size of list
		
		System.out.println(list.size());
		
		// to delete element from the list
		
		list.remove(1/*index*/); //range of index will be from 0 to size - 1 or index
		System.out.println(list);
		
		list.add(60);
		list.add(-20);
		System.out.println(list);
		
		//to get an element from the specific index 
		
		System.out.println(list.get(3));// range of index is 0 to size - 1
		
		//to update value of any index
		
		list.set(1, -5);
		System.out.println(list);
		
		//to print elements of the list
		
		for (int i = 0; i < list.size(); i++) {
			
			System.out.print(list.get(i) + " ");
			
		}
		
		System.out.println();
		
		//enhanced for loop for directly reading the values or elements
		
		for(int val:list) {
			
			System.out.print(val + " ");
		}
		
		System.out.println();
		
		// to take input from the user in the list
		
		Scanner sc = new Scanner(System.in);
		
		ArrayList<Integer> ll = new ArrayList<>();
		
		//taking input from the user
		
		System.out.println("Enter the elements in the list : ");
		for(int i = 0; i < 4; i++) {
			
			ll.add(sc.nextInt());
		}
		
		// printing the input values
		
		System.out.print("Elements in the list are : ");
		for(int i = 0; i < ll.size(); i++) {
			
			System.out.print(ll.get(i) + " ");
		}
		
		System.out.println();
		
		//to sort the list automatically
		
		Collections.sort(ll);
		System.out.print("sorted list : " +  ll + " ");
		
		
		
		
		

	}

}
