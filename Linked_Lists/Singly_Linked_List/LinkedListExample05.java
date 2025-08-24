package DSA_Using_Java.Linked_Lists.Singly_Linked_List;
// How to insert a node at the end of a Singly Linked List in Java

public class LinkedListExample05 {
	private ListNode head;

	private static class ListNode {
		private int data;
		private ListNode next;

		public ListNode(int data) {
			this.data = data;
			this.next = null;
		}
	}

	public void insertLast(int value) {
		ListNode newNode = new ListNode(value);
		if (head == null) { // if the linked list is empty
			head = newNode; // new node assigned as head
			return; // then it will return
		}
		ListNode current = head; // create the temporary head variable
		while (null != current.next) { // traversing till end of the linked list
			current = current.next; // shifting current to current.next
		}
		current.next = newNode; // new node assigned to current.next
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
		// Creating a Singly Linked List
		LinkedListExample05 sll = new LinkedListExample05();
		sll.insertLast(11);
		sll.insertLast(8);
		sll.insertLast(1);
		sll.display();

	}
}
