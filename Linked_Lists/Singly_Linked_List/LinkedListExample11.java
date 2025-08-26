package DSA_Using_Java.Linked_Lists.Singly_Linked_List;
// How to reverse a Singly Linked List

public class LinkedListExample11 {
	private ListNode head;

	private static class ListNode {
		private int data;
		private ListNode next;
		
		public ListNode(int data) {
			this.data = data;
			this.next = null;
		}
	}
	
	public ListNode reverse(ListNode head) {
		if(head == null) { // list has only one element 
			return head;
		}
		ListNode current = head; // current points to head
		// previous and next initially pointed to null
		ListNode previous = null;
		ListNode next = null;
		
		while(current != null) { // traverse till end
			next = current.next; // next points to the current's next reference
			current.next = previous; // current's next reference points to previous
			previous = current; // previous points to current 
			current = next; // current points to next
		}
		return previous;
	}

	public void display(ListNode head) {
		ListNode current = head;
		while(current != null) {
			System.out.print(current.data+" --> ");
			current = current.next;
		}
		System.out.println("null");
	}
	public static void main(String[] args) {
		/*
		 * input: 10 -> 8 -> 1 -> 11 -> null 
		 * output: 11 -> 1 -> 8 -> 10 -> null
		 * 
		 */
		
		// Creating Singly Linked List
		LinkedListExample11 sll = new LinkedListExample11();
		
		sll.head = new ListNode(10);
		ListNode second = new ListNode(8);
		ListNode third = new ListNode(1);
		ListNode fourth = new ListNode(11);
		
		// Connect to form chain
		sll.head.next = second;
		second.next = third;
		third.next = fourth;
		
		sll.display(sll.head); // 10 --> 8 --> 1 --> 11 --> null
		
		ListNode reverseHead = sll.reverse(sll.head);
		sll.display(reverseHead); // 11 --> 1 --> 8 --> 10 --> null

	}

}
