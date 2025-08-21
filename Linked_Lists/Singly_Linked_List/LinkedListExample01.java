package DSA_Using_Java.Linked_Lists.Singly_Linked_List;
// How to create a Singly Linked List
// data.next --> data.next --> data.next --> null

public class LinkedListExample01 {

	private ListNode head;

	private static class ListNode {
		private int data; // Generic Type
		private ListNode next; // Reference to next ListNode in List

		public ListNode(int data) {
			this.data = data;
			this.next = null;
		}
	}

	public static void main(String[] args) {
		/*
		 * head
		 *  |
		 *  10 -> 1 -> 8 -> 11 -> null 
		 * 
		 */
		
		// Creating a Singly Linked List
		LinkedListExample01 sll = new LinkedListExample01();
		sll.head = new ListNode(10);
		ListNode second = new ListNode(1);
		ListNode third = new ListNode(8);
		ListNode fourth = new ListNode(11);

		// Now connect to form a chain
		sll.head.next = second; // 10 --> 1
		second.next = third; // 10 --> 1 --> 8
		third.next = fourth; // 10 --> 1 --> 8 --> 11 --> null

	}
}
