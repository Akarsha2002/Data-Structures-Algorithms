package DSA_Using_Java.Linked_Lists.Doubly_Linked_List;
// How to insert node at the end of a Doubly Linked List

public class LinkedListExample24 {
	private ListNode head;
	private ListNode tail;
	private int length;
	
private class ListNode {
	private int data;
	private ListNode previous;
	private ListNode next;
	
	public ListNode(int data) {
		this.data = data;
	}
}

public LinkedListExample24() {
	this.head = null;
	this.tail = null;
	this.length = 0;
}

public boolean isEmpty() {
	return head == null; // length == 0
}

public int length() {
	return length;
}

public void insertLast(int value) {
	ListNode newNode = new ListNode(value);
	if(isEmpty()) {
		head = newNode; // head is pointed to newNode
	}
	else {
		tail.next = newNode; // tail's next reference assigned to newNode
		newNode.previous = tail; // newNode's previous reference assigned to tail
	}
	tail = newNode; // tail is pointed to newNode
	length++; // length is incremented
}

public void displayForward() {
	if(isEmpty()) {
		return;
	}
	else {
		ListNode forward = head;
		while(forward != null) {
			System.out.print(forward.data+" --> ");
			forward = forward.next;
		}
		System.out.println("null");
	}
}

public void displayBackward() {
	if(isEmpty()) {
		return;
	}
	else {
		ListNode backward = tail;
		while(backward != null) {
			System.out.print(backward.data+" <-- ");
			backward = backward.previous;
		}
		System.out.println("null");
	}
}
	public static void main(String[] args) {
		/*
		 *         head                   tail
		 *          |                      |   
		 * null <-- 1 <--> 10 <--> 15 <--> 65 --> null
		 * 
		 *  displayForward output: 1 --> 10 --> 15 --> null 
		 *  
		 *  displayBackward output: 15 <-- 10 <-- 1 <-- null
		 * 
		 */
		
		// Creating Doubly Linked List
		LinkedListExample24 dll = new LinkedListExample24();
		dll.insertLast(1);
		dll.insertLast(10);
		dll.insertLast(15);
		
		dll.displayForward();
		dll.displayBackward();
		
	}

}
