package datastructure;

import java.util.ArrayList;
import java.util.LinkedList;

public class UseArrayList {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use ArrayList that includes add,peek,remove,retrieve elements.
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 * Store all the sorted data into one of the databases.
		 * 
		 */

		ArrayList<Integer> myList = new ArrayList<Integer>();
		ArrayList<Integer> removedList = new ArrayList<Integer>();
		
		for (int i=0; i<10; i++){
			myList.add(i+1);
		}
		for (int j=0; j<10; j++){
			System.out.print(myList.get(j)+" ");
		}
		//peek 5th element
		System.out.println("\nThe item I would like to delete is : " + myList.get(4));
		// remove 5th element and print out new list
		
		removedList.add(myList.remove(4));
		System.out.println("New List after deleting an item" + myList);
		
		// retrieve deleted data and put it back to the original list
		myList.add(4,removedList.get(0));
		
		System.out.println("Retrieve the deleted item and put it back to the original position" +myList);
		
	}	
}
