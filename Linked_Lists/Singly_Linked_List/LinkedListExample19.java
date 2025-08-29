package DSA_Using_Java.Linked_Lists.Singly_Linked_List;
// Merge Two Sorted Singly Linked List

public class LinkedListExample19 {
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

public static ListNode merge(ListNode a, ListNode b) {
	/*
	 * a --> 1 -> 3 -> 5 -> null
	 * b --> 2 -> 4 -> 6 -> null
	 * result --> 1 -> 2 -> 3 -> 4 -> 5 -> 6 -> null
	 * 
	 */
	
	ListNode dummy = new ListNode(0); // creating dummy ListNode for merging 2 Linked Lists
	ListNode tail = dummy; // the tail is assigned to dummy
	
	/*
	 * Without Creating ListNode dummy = new ListNode(0);
	 * 
	 * which one become head in the 2 linked list
	 * ListNode head = null; // initially head assigned to null
	 * 
	 * if(a.data <= b.data) { // if Linked List a's data <= Linked List b's data
	 * head = a; // a is assigned as head
	 * a = a.next; // a is shifted to next reference
	 * }
	 * else {
	 * head = b; // b is assigned as head
	 * b = b.next; // b is shifted to next reference
	 * }
	 * 
	 * ListNode tail = head; // tail is assigned to head
	 * 
	 */
	
	while(a != null && b != null) { // traversing 2 Linked List 'a' and 'b' till end
		if(a.data <= b.data) { // if Linked List a's data <= Linked List b's data
			tail.next = a; // tail's next reference to a
			a = a.next; // a shifts to their next reference
		}
		else {
			tail.next = b; // tail's next reference to b
			b = b.next; // b shifts to their next reference
		}
		tail = tail.next; // tail shifts to next reference
	}
	
	/*
	 * a --> 1 -> 3 -> 5 -> null
	 * b --> 2 -> 4 -> 6 -> null
	 * result --> 1 -> 2 -> 3 -> 4 -> 5 -> 6 -> null
	 * 
	 */
	
	if(a == null) { // if Linked List 'a' is exhausted
		tail.next = b; // tail's next assigned to b
	}
	else { // if Linked List 'b' is exhausted
		tail.next = a; // tail's next assigned to a
	}
	
	// if dummy is not created return head;
	return dummy.next;
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
		 * Given two sorted singly linked lists,
		 * merge them so that the resulting singly linked list also sorted
		 * Example:
		 *    head1 --> 1 -> 4 -> 8 -> null
		 *    head2 --> 3 -> 6 -> 7 -> null
		 * 
		 * output: head --> 1 -> 3 -> 4 -> 6 -> 7 -> 8 -> null
		 * 
		 */
		
		// Creating Singly Linked List
		LinkedListExample19 sll1 = new LinkedListExample19();
		sll1.insertLast(1);
		sll1.insertLast(4);
		sll1.insertLast(8);
		
		LinkedListExample19 sll2 = new LinkedListExample19(); 
		sll2.insertLast(3);
		sll2.insertLast(5);
		sll2.insertLast(8);
		sll2.insertLast(9);
		sll2.insertLast(14);
		sll2.insertLast(18);
		
		sll1.display();
		sll2.display();
		
		LinkedListExample19 result = new LinkedListExample19();
		result.head = merge(sll1.head, sll2.head);
		result.display();
		
	}
}
