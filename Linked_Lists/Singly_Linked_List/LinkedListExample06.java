package DSA_Using_Java.Linked_Lists.Singly_Linked_List;
// Insert a node in a Singly Linked List at a given position

public class LinkedListExample06 {
private ListNode head;

private static class ListNode{
	private int data;
	private ListNode next;
	
	public ListNode(int data) {
		this.data = data;
		this.next = null;
	}
}

public void insertPosition(int value, int position) {
	// 1 -> 4 -> 5 inserting 1 at 1st position
	// 1 -> 6 -> 4 -> 5 inserting 6 at 2nd position
	
	ListNode node = new ListNode(value); // Creating the node
	
	if(position == 1) { // node want to insert to 1st position
		node.next = head; // node reference assigned to head
		head = node; // head assigned to node
	}
	else { // inserting node in specific position
		ListNode previous = head; // assigning previous to head
		int count = 1; // position - 1
		while(count < position - 1) { // Traversing singly linked list
			previous = previous.next; // shifting previous pointer to next  
			count++; // increment the count
		}
		// After got the position
		ListNode current = previous.next; // current pointer assigned to reference
		previous.next = node; // previous reference assigned node
		node.next = current; // node reference assigned to current
	}
}

public void display() {
	ListNode current = head;
	while(current != null){
		System.out.print(current.data+" --> ");
		current = current.next;
	}
	System.out.print("null");
}
	public static void main(String[] args) {
		/*
		 * Implement method to insert a node at given position.
		 * Assuming position to be valid and starting from 1.
		 */
		
		LinkedListExample06 sll = new LinkedListExample06();
		sll.insertPosition(3, 1); // 3 -> null
		sll.insertPosition(5, 2); // 3 -> 5 -> null
		sll.insertPosition(2, 1); // 2 -> 3 -> 5 -> null
		sll.insertPosition(4, 2); // 2 -> 4 -> 3 -> 5 -> null
		sll.insertPosition(7, 5); // 2 -> 4 -> 3 -> 5 -> 7 -> null
		sll.display();

	}
}
