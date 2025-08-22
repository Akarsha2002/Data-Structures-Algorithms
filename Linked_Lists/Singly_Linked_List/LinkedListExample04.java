package DSA_Using_Java.Linked_Lists.Singly_Linked_List;
// How to insert node at the beginning of a Singly Linked List

public class LinkedListExample04 {
	private ListNode head;
	
	public static class ListNode {
		private int data;
		private ListNode next;
		
		public ListNode(int data){
			this.data = data;
			this.next = null;
		}
	}

	public void insertFirst(int value) {
		ListNode newNode = new ListNode(value); // Creating new node
		newNode.next = head; // head pointed to newNode.next
		head = newNode; // new node pointed to head
	}
	
	public void display() {
		ListNode current = head;
		while(current != null) {
			System.out.print(current.data+" --> ");
			current = current.next;
		}
		System.out.print("null");
	}
	public static void main(String[] args) {
		// Insert node in beginning
		LinkedListExample04 sll = new LinkedListExample04();
		sll.insertFirst(11);
		sll.insertFirst(8);
		sll.insertFirst(1);
		sll.display();

	}

}
