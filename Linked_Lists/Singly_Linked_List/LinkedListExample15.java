package DSA_Using_Java.Linked_Lists.Singly_Linked_List;
// How to remove a given key from Singly Linked List

public class LinkedListExample15 {
private ListNode head;

private static class ListNode {
	private int data;
	private ListNode next;
	
	public ListNode(int data) {
		this.data = data;
		this.next = null;
	}
}

public void insertPostion(int value, int position) {
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

public void deleteNode(int key) {
	ListNode current = head; // current point's to head
	ListNode temp = null; // temp point's to null
	
	if(current != null && current.data == key) { // traverse till end and find the searchKey 
		head = current.next; // head will assigned to current's reference
		return; // return from method
	}
	else {
		while(current != null && current.data != key) { // traverse till end and not find the searchKey 
			temp = current; // temp assigned to current
			current = current.next; // current shifts to next
		}
		if(current == null) { // if current equal to null
			return; // return from method
		}
		temp.next = current.next; // temp's reference assigned to current's reference
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
		 * input: 1 -> 8 -> 10 -> 11 -> 16 -> null
		 * Key: 11 has to remove
		 * 
		 *        head
		 *         |
		 * output: 1 -> 8 -> 10 -> 16 -> null
		 * key: 11 removed 
		 * 
		 */
		
		// Creating Singly Linked List
		LinkedListExample15 sll = new LinkedListExample15();
		sll.insertPostion(1, 1);
		sll.insertPostion(8, 2);
		sll.insertPostion(10, 3);
		sll.insertPostion(11, 4);
		sll.insertPostion(16, 5);
		sll.display();
		
		sll.deleteNode(11);
		sll.display();
	}

}
