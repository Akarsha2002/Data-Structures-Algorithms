package DSA_Using_Java.Linked_Lists.Circular_Singly_Linked_List;
// How to insert node at the beginning of a Circular Singly Linked List

public class LinkedListExample29 {
	private ListNode last;
	private int length;
	
private class ListNode {
	private int data;
	private ListNode next;
	
	public ListNode(int data) {
		this.data = data;
	}
}

public LinkedListExample29() {
	this.last = null;
	this.length = 0;
}

public boolean isEmpty() {
	return length == 0; // last == null
}

public int length() {
	return length;
}

public void insertFirst(int value) {
	ListNode newNode = new ListNode(value); // Creating a ListNode
	if(isEmpty()) { // Checking CLL is empty
		last = newNode;
	}
	else {
		newNode.next = last.next; // it's CLL
	}
	last.next = newNode; // track the last node
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
		 *                              last
		 *                               |
		 * output:  --> 16 -> 10 -> 8 -> 1 --
		 *         |_________________________|
		 * 
		 * 
		 */
		
		// Creating Circular Singly Linked List
		LinkedListExample29 cll = new LinkedListExample29();
		cll.insertFirst(1);
		cll.insertFirst(8);
		cll.insertFirst(10);
		cll.insertFirst(26);
		cll.display();

	}
}
