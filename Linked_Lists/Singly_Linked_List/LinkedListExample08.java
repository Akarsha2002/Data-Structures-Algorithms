package DSA_Using_Java.Linked_Lists.Singly_Linked_List;
// Delete Last node of a Singly Linked List

public class LinkedListExample08 {
	private ListNode head;

	public static class ListNode {
		private int data;
		private ListNode next;

		public ListNode(int data) {
			this.data = data;
			this.next = null;
		}
	}

	public void insertLast(int value) {
		ListNode newNode = new ListNode(value);
		if (head == null) {
			head = newNode;
			return;
		} else {
			ListNode current = head;
			while (null != current.next) {
				current = current.next;
			}
			current.next = newNode;
		}
	}

	public ListNode deleteLast() {
		if (head == null || head.next == null) { // Checking if linked list have single element
			return head;
		} else {
			ListNode deleted = head; // deleted assigned to
			ListNode previous = null; // previous assigned as null
			while (deleted.next != null) { // traversing till end
				previous = deleted; // previous pointed to deleted
				deleted = deleted.next; // deleted pointed to their reference
			}
			previous.next = null; // breaking the chain
			return deleted;

		}
	}

	public void display() {
		ListNode current = head;
		while (current != null) {
			System.out.print(current.data + " --> ");
			current = current.next;
		}
		System.out.println("null");
	}

	public static void main(String[] args) {
		// Creating Singly Linked List
		LinkedListExample08 sll = new LinkedListExample08();
		sll.insertLast(1);
		sll.insertLast(2);
		sll.insertLast(3);
		sll.display();

		System.out.println(sll.deleteLast().data);
		System.out.println(sll.deleteLast().data);
		System.out.println(sll.deleteLast().data);
		System.out.println(sll.deleteLast().data); // returning header data
		sll.display();

	}

}
