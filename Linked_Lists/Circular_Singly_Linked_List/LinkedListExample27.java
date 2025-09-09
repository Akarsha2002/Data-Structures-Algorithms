package DSA_Using_Java.Linked_Lists.Circular_Singly_Linked_List;
// How to represent a Circular Singly Linked List and Implementation

public class LinkedListExample27 {
	private ListNode last;
	private int length;

	private class ListNode {
		private int data;
		private ListNode next;

		public ListNode(int data) {
			this.data = data;
		}
	}

	public LinkedListExample27() {
		this.last = null;
		this.length = 0;
	}
	
	public boolean isEmpty() {
		return length == 0;
	}
	
	public int length() {
		return length;
	}
	
	public void createCircularLinkedList() {
		ListNode first = new ListNode(1);
		ListNode second = new ListNode(8);
		ListNode third = new ListNode(10);
		ListNode fourth = new ListNode(16);
		
		first.next = second;
		second.next = third;
		third.next = fourth;
		fourth.next = first;
		
		last = fourth;
	}
	
	public static void main(String[] args) {
		/*
		 *                     last
		 *                      |
		 *  --> 1 -> 8 -> 10 -> 16 --
		 * |_________________________|
		 * 
		 */

		// Creating Circular Singly Linked List
		LinkedListExample27 cll = new LinkedListExample27();
		cll.createCircularLinkedList();
	}

}
