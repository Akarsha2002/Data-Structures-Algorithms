package DSA_Using_Java.Linked_Lists.Circular_Singly_Linked_List;
// How to insert node at the end of a Circular Singly Linked List

public class LinkedListExample30 {
	private ListNode last;
	private int length;
	
private class ListNode {	
	private int data;
	private ListNode next;
	
	public ListNode(int data) {
		this.data = data;
	}
}

public LinkedListExample30() {
	this.last = null;
	this.length = 0;
}

public boolean isEmpty() {
	return length == 0; // last == null
}

public int length() {
	return length;
}

public void insertLast(int value) {
	ListNode newNode = new ListNode(value); // Creating a ListNode
	if(isEmpty()) { // Checking CLL is empty
		last = newNode; 
		last.next = last; // last node pointed to itself
	}
	else {
		newNode.next = last.next; // CLL's characteristics
		last.next = newNode; // breaking link to itself
		last = newNode; // last pointer shifts to newNode
	}
	length++; // length extended
}

public void display() {
	if(isEmpty()) {
		return;
	}
	else {
		ListNode first = last.next;
		while(first != last) {
			System.out.print(first.data+" --> ");
			first = first.next;
		}
		System.out.println(first.data);
	}
}
	public static void main(String[] args) {
		/*
		 * last
		 *  |
		 * null
		 * 
		 * input: 1 -> null, 8 -> null, 10 -> null, 16 -> null
		 * 
		 *                             last
		 *                              |
		 * output:  --> 1 -> 8 -> 10 -> 16 --
		 *         |_________________________|
		 * 
		 */
		
		// Creating Circular Linked List
		LinkedListExample30 cll = new LinkedListExample30();
		cll.insertLast(1);
		cll.insertLast(8);
		cll.insertLast(10);
		cll.insertLast(16);
		cll.display();

	}
}
