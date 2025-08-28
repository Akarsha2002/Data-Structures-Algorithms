package DSA_Using_Java.Linked_Lists.Singly_Linked_List;
// How to remove duplicates from sorted Linked List

public class LinkedListExample13 {
private ListNode head;

private static class ListNode {
	private int data;
	private ListNode next;
	
	public ListNode(int data) {
		this.data = data;
		this.next = null;
	}
}

public void insertLast(int value) {
	ListNode newNode = new ListNode(value);
	if(head == null) {
		head = newNode;
	}
	else {
		ListNode current = head;
		while(null != current.next) {
			current = current.next;
		}
		current.next = newNode;
	}
}

public void removeDuplicates() {
	if(head == null) { // node doesn't have elements
		return;
	} 
	else {
		ListNode current = head; // current pointer points to head
		while(current != null && current.next != null) { // traversing Linked List till end
			if(current.data == current.next.data) { // if previous node's data and their next data are same
				current.next = current.next.next; // current builds connection with current.next.next data reference
			}
			else {
				current = current.next; // shifts the current pointer
			}
		}
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
		 * input - Sorted Linked List
		 * head
		 *  |
		 *  1 -> 1 -> 2 -> 3 -> 3 -> null
		 *  output
		 *  head
		 *  |
		 *  1 -> 2 -> 3 -> null
		 * 
		 */
		// Creating Linked List
		LinkedListExample13 sll = new LinkedListExample13();
		sll.insertLast(1);
		sll.insertLast(1);
		sll.insertLast(2);
		sll.insertLast(3);
		sll.insertLast(3);
		sll.display();
		
		sll.removeDuplicates();
		sll.display();
	}

}
