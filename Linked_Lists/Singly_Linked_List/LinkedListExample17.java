package DSA_Using_Java.Linked_Lists.Singly_Linked_List;
// How to find start of loop in a Singly Linked List

public class LinkedListExample17 {
private ListNode head;

private static class ListNode {
	private int data;
	private ListNode next;
	
	public ListNode(int data) {
		this.data = data;
		this.next = null;
	}
}

public void createALoopInLinkedList() {
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
		
		if(fastPtr == slowPtr) {
			return true;
		}
	}
	return false;
	
}

public ListNode startNodeInLoop() {
	// Floyd's Cycle Detection Algorithm
	ListNode fastPtr = head;
	ListNode slowPtr = head;
	
	while(fastPtr != null && fastPtr.next != null) {
		fastPtr = fastPtr.next.next;
		slowPtr = slowPtr.next;
		
		if(fastPtr == slowPtr) {
			// returning value from the getStartingNode(slowPtr)
			return getStartingNode(slowPtr); 
		}
	}
	return null;
}

private ListNode getStartingNode(ListNode slowPtr) {
	ListNode temp = head; // Initialize the temp to head
	
	while(temp != slowPtr) { // loops till temp and slowPtr points same node
		temp = temp.next; // temp shifts to next node 
		slowPtr = slowPtr.next; // slowPtr shifts to next node 
	}
	return temp; // starting node of the loop
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
		 * output: 3
		 * 
		 */
		
		// Creating Singly Linked List
		LinkedListExample17 sll = new LinkedListExample17();
		
		sll.createALoopInLinkedList();
//		sll.display(); // This code loops from 3
				
		System.out.println(sll.containsLoop());
		System.out.println(sll.startNodeInLoop().data);

	}
}
