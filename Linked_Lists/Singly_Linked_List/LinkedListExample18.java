package DSA_Using_Java.Linked_Lists.Singly_Linked_List;
// How to remove loop from a Singly Linked List

public class LinkedListExample18 {
private ListNode head;

private static class ListNode {
	private int data;
	private ListNode next;
	
	public ListNode(int data) {
		this.data = data;
		this.next = null;
	}
}

public void createLoopInLinkedList() {
	ListNode first = new ListNode(1);
	ListNode second = new ListNode(2);
	ListNode third = new ListNode(3);
	ListNode fourth = new ListNode(4);
	ListNode fifth = new ListNode(5);
	ListNode sixth = new ListNode(6);
	
	head = first;
	first.next = second;
	second.next = third;
	third.next = fourth;
	fourth.next = fifth;
	fifth.next = sixth;
	sixth.next = third;
}

public boolean containsLoop() {
	ListNode fastPtr = head;
	ListNode slowPtr = head;
	
	while(fastPtr != null && fastPtr.next != null) {
		fastPtr = fastPtr.next.next;
		slowPtr = slowPtr.next;
		
		if(slowPtr == fastPtr) {
			return true;
		}
	}
	return false;
}

public void removeLoop() {
	// Floyd's Cycle Detection Algorithm
	ListNode fastPtr = head;
	ListNode slowPtr = head;
	
	while(fastPtr != null && fastPtr.next != null) {
		fastPtr = fastPtr.next.next;
		slowPtr = slowPtr.next;
		
		if(fastPtr == slowPtr) {
			removeLoop(slowPtr); // removeLoop() called by slowPtr parameter
			return;
		}
	}
}

private void removeLoop(ListNode slowPtr) {
	ListNode temp = head;
	
	/*
	 * shifting temp and slowPtr for one step till
	 * temp's next reference == slowPtr's next reference
	 * breaking loop by slowPtr's reference assigned to null
	 * 
	 */
	while(temp.next != slowPtr.next) {
		temp = temp.next;
		slowPtr = slowPtr.next;
	}
	slowPtr.next = null;
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
		 *       head
		 *        |
		 * input: 1 -> 2 -> 3 -> 4
		 *                  ^    |
		 *                  |    v
		 *                  6 <- 5 
		 * 
		 *        head
		 *         |
		 * output: 1 -> 2 -> 3 -> 4 -> 5 -> 6 -> null
		 * 
		 * 
		 */
		
		// Creating Singly Linked List
		LinkedListExample18 sll = new LinkedListExample18();
		sll.createLoopInLinkedList();
		System.out.println(sll.containsLoop());
		
		sll.removeLoop();
		sll.display();
		
	}

}
