package datastructure;

import java.util.LinkedList;

public class UseLinkedList {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use LinkedList that includes add,peek,remove,retrieve elements.
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 * 
		 */
	LinkedList<Integer> myList = new LinkedList<Integer>();
	
	
    myList.add(1);
    myList.add(2);
    myList.add(3);
    myList.add(4);
    myList.add(5);
     System.out.println(myList);
     System.out.println(myList.peek());
     System.out.println(myList.removeFirst());
     System.out.println("New List after removing 1st item: " +myList);
	}

}
