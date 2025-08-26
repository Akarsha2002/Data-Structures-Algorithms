package DSA_Using_Java.Linked_Lists.Singly_Linked_List;
// How to find nth node from the end of a Linked List

public class LinkedListExample12 {
private ListNode head;

private static class ListNode {
	private int data;
	private ListNode next;
	
	public ListNode(int data) {
		this.data = data;
		this.next = null;
	}
}

public void insertFirst(int value) {
	ListNode newNode = new ListNode(value);
	newNode.next = head;
	head = newNode;
}

public ListNode getNthNodeFromEnd(int n) {
	if(head == null) { // if head pointing to null
		return null;
	}
	else if(n <= 0) {  // enter only nth valid node
		throw new IllegalArgumentException("Invalid value: n = "+n);
	}
	else { // The valid node
		// mainPtr & refPtr pointed to head
		ListNode mainPtr = head;
		ListNode refPtr = head;
		int count = 0; // initial count is 0 for traversal 
		
		while(count < n) { // traversing linked list
			if(refPtr == null) { // nth node is grater than the existed nodes in linked list.
				throw new IllegalArgumentException(n+" is greater than the number of nodes in the list");
			}
			refPtr = refPtr.next; // shifting reference pointer
			count++; // incrementing counter
		}
		while(refPtr != null) { // reference pointer not be null
			refPtr = refPtr.next; // shifting reference pointer
			mainPtr = mainPtr.next; // shifting main pointer
		}
		return mainPtr; // returning node.data
	}
}

public void display() {
	ListNode current = head;
	while(current != null) {
		System.out.print(current.data+" --> ");
		current = current.next;
	}
	System.out.println("null");
}
	public static void main(String[] args) {
		/*
		 * Input - A Linked List and a value of n
		 * 10 -> 8 -> 1 -> 11 -> 15 -> null
		 * |
		 * head  n = 2
		 * Output - 2nd node from the end is 11
		 * head     2nd node from end
		 * |               |
		 * 10 -> 8 -> 1 -> 11 - 15 -> null
		 * 
		 */
		
		// Creating Singly Linked List
		LinkedListExample12 sll = new LinkedListExample12();
		sll.insertFirst(15);
		sll.insertFirst(11);
		sll.insertFirst(1);
		sll.insertFirst(8);
		sll.insertFirst(10);
		sll.display();
		
		ListNode nthNodeFromEnd = sll.getNthNodeFromEnd(2);
		// ListNode nthNodeFromEnd = sll.getNthNodeFromEnd(-1); Invalid value: n = -1
		// ListNode nthNodeFromEnd = sll.getNthNodeFromEnd(6); 6 is greater than the number of nodes in the list
		// System.out.println("nth Node from End is "+nthNodeFromEnd); this only prints the reference
		System.out.println("nth Node from End is "+nthNodeFromEnd.data);
		

	}

}
