package UnitTestCases;

import java.util.LinkedList;

	class AccessFirstAndLastElements {
	    public static void main(String[] args)
	    {
	        // Initializing the Linked List
	        LinkedList<Integer> ll = new LinkedList<>();
	 
	        // Adding elements to the Linked List
	        ll.add(2);
	        ll.add(5);
	        ll.add(5);
	        ll.add(7);
	        ll.add(10);
	        ll.add(6);
	 
	        // Getting the first element
	        System.out.println("First Element is : "
	                           + ll.getFirst());
	 
	        // Getting the last element
	        System.out.println("Last Element is : "
	                           + ll.getLast());
	    }
	}

