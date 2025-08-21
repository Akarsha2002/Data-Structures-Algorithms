package DSA_Using_Java.Linked_Lists.Singly_Linked_List;
// How to print elements of a Singly Linked List

public class LinkedListExample02 {
private ListNode head;

private static class ListNode{
	private int data; // Generic Type
	private ListNode next;
	
	public ListNode(int data) {
		this.data = data;
		this.next = null;
	}
}

public void display() {
	ListNode current = head; // current variable assigned to head 
	while(current != null) { // loop till current points to null
		System.out.print(current.data + " --> "); // printing data
		current = current.next; // pointing to next node
	}
	System.out.print("null"); // printing null when ListNode not present
}
	public static void main(String[] args) {
		// Creating Singly Linked List
		LinkedListExample02 sll = new LinkedListExample02();
		sll.head = new ListNode(10);
		ListNode second = new ListNode(1);
		ListNode third = new ListNode(8);
		ListNode fourth = new ListNode(11);
		
		// Now we will connect them together to form a chain
		sll.head.next = second; // 10 --> 1
		second.next = third; // 10 --> 1 --> 8
		third.next = fourth; // 10 --> 1 --> 8 --> 11
		
		sll.display();

	}
}
