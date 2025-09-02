package DSA_Using_Java.Linked_Lists.Doubly_Linked_List;
// How to represent Doubly Linked List and Implementation

public class LinkedListExample21 {
private ListNode head;
private ListNode tail;
private int length;
	
private class ListNode{
	private int data;
	private ListNode previous;
	private ListNode next;
	
	public ListNode(int data) {
		this.data = data;
	}
}

public LinkedListExample21() {
	// initially the head and tail pointed to null
	this.head = null;
	this.tail = null;
	this.length = 0; // initially length assigned as 0
}

public boolean isEmpty() {
	return length == 0; // head == null
}

public int length() {
	return length;
}
	public static void main(String[] args) {
		/*
		 *         head                   tail
		 *          |                      |
		 * null <-- 1 <--> 10 <--> 15 <--> 65 --> null
		 * 
		 */
		
		// Creating Doubly Linked List Object
		LinkedListExample21 dll = new LinkedListExample21();
		System.out.println("Is the doubly linked list is empty "+dll.isEmpty());
		System.out.println("No. of elements in the doubly linked list "+dll.length());

	}
}
