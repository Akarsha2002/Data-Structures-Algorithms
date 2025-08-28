package DSA_Using_Java.Linked_Lists.Singly_Linked_List;
// How to insert a node in a sorted Singly Linked List

public class LinkedListExample14 {
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
	if(position == 1) {
		node.next = head;
		head = node;
	}
	else {
		ListNode previous = head;
		int count = 1;
		while(count < position - 1) {
			previous = previous.next;
			count++;
		}
		ListNode current = previous.next;
		previous.next = node;
		node.next = current;
	}
}

public ListNode insertInSortedList(int value) {
	ListNode newNode = new ListNode(value); // create the ListNode(value)
	
	if(head == null) { // head doesn't have element
		return newNode; // insert that node
	}
	else {
		ListNode current = head; // current points to head
		ListNode temp = null; // temp initialized to null
		
		/*
		 *  traverse till and current.data < newNode.data
		 *  because not altering the original order of the Linked List
		 *  
		 */
		while(current != null && current.data < newNode.data) { 
			temp = current; // temp will points to current
			current = current.next; // current shifts the pointer
		}
		newNode.next = current; // newNode's reference assigned to current pointer
		temp.next = newNode; // temp's reference assigned to newNode
		return head;
	}
}

public void display() {
	ListNode current = head;
	while(current != null) {
		System.out.print(current.data+" --> ");
		current = current.next;
	}
	System.out.println("null");
}
	public static void main(String[] args) {
		/*
		 *       head
		 *        |
		 * input: 1 -> 8 -> 10 -> 16 -> null
		 *  insert newNode --> 11 -> null
		 *  
		 *          head
		 *           |
		 *   output: 1 -> 8 -> 10 -> 11 -> 16 -> null
		 * 
		 */
		
		// Creating Singly Linked List
		LinkedListExample14 sll = new LinkedListExample14();
		sll.insertPosition(1, 1);
		sll.insertPosition(8, 2);
		sll.insertPosition(10, 3);
		sll.insertPosition(16, 4);
		sll.display();
		
		sll.insertInSortedList(11);
		sll.display();
		
	}

}
