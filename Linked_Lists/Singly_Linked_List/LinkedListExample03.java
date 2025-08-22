package DSA_Using_Java.Linked_Lists.Singly_Linked_List;
// How to find length of a Singly Linked List in Java

public class LinkedListExample03 {
	private ListNode head;

	public static class ListNode {
		private int data;
		private ListNode next;

		public ListNode(int data) {
			this.data = data;
			this.next = null;
		}
	}

	public int count() {
		if (head == null) {
			return 0;
		}

		ListNode current = head; // initializing current node as head
		int count = 0; // initially count 0
		while (current != null) { // loop till current reaches at the end
			count++; // increment count
			current = current.next; // assign current to next
		}
		return count;
	}

	public void display() {
		ListNode current = head;
		while (current != null) {
			System.out.print(current.data + " --> ");
			current = current.next;
		}
		System.out.print("null");
	}

	public static void main(String[] args) {
		// Create Singly Linked List
		LinkedListExample03 sll = new LinkedListExample03();
		sll.head = new ListNode(10);
		ListNode second = new ListNode(1);
		ListNode third = new ListNode(8);
		ListNode fourth = new ListNode(11);

		// Connect together to form chain
		sll.head.next = second;
		second.next = third;
		third.next = fourth;

		System.out.println("The number of elements in the singly linked list: " + sll.count());
		sll.display();
	}

}
