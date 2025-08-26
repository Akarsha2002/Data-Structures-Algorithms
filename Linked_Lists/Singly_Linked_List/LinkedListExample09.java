package DSA_Using_Java.Linked_Lists.Singly_Linked_List;

//Delete a node from a Singly Linked List at a given position

public class LinkedListExample09 {
	private ListNode head;

	private static class ListNode {
		private int data;
		private ListNode next;

		public ListNode(int data) {
			this.data = data;
			this.next = null;
		}

	}

	public void insertPosition(int value, int position) {
		ListNode node = new ListNode(value);

		if (position == 1) {
			node.next = head;
			head = node;
		} else {
			ListNode previous = head;
			int count = 1;
			while (count < position - 1) {
				previous = previous.next;
				count++;
			}
			ListNode current = previous.next;
			previous.next = node;
			node.next = current;

		}
	}

	public void deletePosition(int position) {
		// position is valid and starting from 1
		// 3 -> 4 -> 7 -> 8 -> 9 -> null
		if (position == 1) { // to delete position one
			head = head.next; // head deleted and it assigned to the next
		} else {
			ListNode previous = head; // previous starts from head
			int count = 1; // Assuming position starts from one
			while (count < position - 1) { // traverse till that position
				previous = previous.next; // previous shifted to the next reference
				count++; // incrementing count
			}
			ListNode deleted = previous.next; // deleted assigned to previous pointer's next reference
			previous.next = deleted.next; // previous.next assigned to deleted pointer's next reference
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
		/*
		 * Implement method to delete a node at given position. Assuming position to be
		 * valid and starting from 1. For example 10 -> 1 -> 8 -> 11 -> null
		 * 
		 */
		
		// Creating Singly Linked List
		LinkedListExample09 sll = new LinkedListExample09();
		sll.insertPosition(10, 1);
		sll.insertPosition(9, 2);
		sll.insertPosition(8, 3);
		sll.display();
		
		sll.deletePosition(1);
		sll.deletePosition(2);
		sll.display();
		

	}

}
