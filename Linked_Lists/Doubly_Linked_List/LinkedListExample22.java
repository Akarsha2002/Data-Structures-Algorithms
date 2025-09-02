package DSA_Using_Java.Linked_Lists.Doubly_Linked_List;
// How to print elements of a Doubly Linked List

public class LinkedListExample22 {
	private ListNode head;
	private ListNode tail;
	private int length;
	
private class ListNode {
	private int data;
	private ListNode previous;
	private ListNode next;
	
	private ListNode(int data) {
		this.data = data;
	}	
}

public LinkedListExample22() {
	this.head = null;
	this.tail = null;
	this.length = 4;
}

public void ddlDemo() {
	ListNode first = new ListNode(1);
	ListNode second = new ListNode(10);
	ListNode third = new ListNode(15);
	ListNode fourth = new ListNode(25);
	
	head = first;
	first.next = second;
	second.next = third;
	third.next = fourth;
	
	tail = fourth;
	fourth.previous = third;
	third.previous = second;
	second.previous = first;
	
}

public void display() {
	ListNode current = head;
	while(current != null) {
		System.out.print(current.data+" <--> ");
		current = current.next;
	}
	System.out.println("null");
}

public boolean isEmpty() {
	return head == null; // length == 0 
}

public int length() {
	return length;
}

public void displayForward() {
	if(head == null) { // if empty list
		return; // return from method
	}
	ListNode forward = head; // traversal start from head
	while(forward != null) { // traverses till ending point
		System.out.print(forward.data+" --> ");
		forward = forward.next; // shifting forward pointer to next reference
	}
	System.out.println("null");
}

public void displayBackward() {
	if(tail == null) { // if empty list
		return; // return from method
	}
	ListNode backward = tail; // traversal start from tail
	while(backward != null) { // // traverses till starting point
		System.out.print(backward.data+" <-- ");
		backward = backward.previous; // shifting backward pointer to previous reference
	}
	System.out.println("null");
}

	public static void main(String[] args) {
		/*
		 *         head                   tail
		 *          |                      |
		 * null <-- 1 <--> 10 <--> 15 <--> 25 --> null
		 * 
		 * input: 1 <--> 10 <--> 15 <--> 25 <--> null
		 * 
		 * displayForward output: 1 --> 10 --> 15 --> 25 --> null
		 * 
		 * displayBackward output: 25 <-- 15 <-- 10 <-- 1 <-- null
		 * 
		 */
				
		// Creating Doubly Linked List
		LinkedListExample22 dll = new LinkedListExample22();
		dll.ddlDemo();
		
		System.out.println("Is the doubly linked list is empty "+dll.isEmpty());
		System.out.println("No. of elements in the doubly linked list "+dll.length());
		
		dll.display();
		
		dll.displayForward();
		dll.displayBackward();
		
	}
}
