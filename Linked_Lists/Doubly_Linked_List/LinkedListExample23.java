package DSA_Using_Java.Linked_Lists.Doubly_Linked_List;
// How to insert node at the beginning of a Doubly Linked List

public class LinkedListExample23 {
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
	
	public boolean isEmpty() {
		return head == null; // length == 0
	}
	
	public int length() {
		return length;
	}
	
	public LinkedListExample23(){
		this.head = null;
		this.tail = null;
		this.length = 0;
	}
	
	public void insertFirst(int value) {
		ListNode newNode = new ListNode(value);
		if(isEmpty()) {
			tail = newNode; // inserting newNode to tail
		}
		else {
			head.previous = newNode; // newNode assigned to head's previous pointer
		}
		newNode.next = head; // newNode's next reference pointed to head
		head = newNode; // newNode becomes head
		length++; // length is incremented
	}
	
	public void displayForward() {
		if(isEmpty()) {
			return;
		}
		ListNode forward = head;
		while(forward != null) {
			System.out.print(forward.data+" --> ");
			forward = forward.next;
		}
		System.out.println("null");
	}
	
	public void displayBackward() {
		if(isEmpty()) {
			return;
		}
		ListNode backward = tail;
		while(backward != null) {
			System.out.print(backward.data+" <-- ");
			backward = backward.previous;
		}
		System.out.println("null");
	}
	
	public static void main(String[] args) {
		/*
		 *         head                   tail
		 *          |                      |   
		 * null <-- 1 <--> 10 <--> 15 <--> 65 --> null
		 * 
		 *  displayForward output: 10 --> 1 --> null 
		 *  
		 *  displayBackward output: 1 <-- 10 <-- null
		 * 
		 */
		
		// Create the Doubly Linked List
		LinkedListExample23 dll = new LinkedListExample23();
		dll.insertFirst(1);
		dll.insertFirst(10);
		
		dll.displayForward();
		dll.displayBackward();
		
	}
}
