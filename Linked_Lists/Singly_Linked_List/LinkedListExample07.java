package DSA_Using_Java.Linked_Lists.Singly_Linked_List;
// Deleting first node of a Singly Linked List

public class LinkedListExample07 {
private ListNode head;

private static class ListNode{
	private int data;
	private ListNode next;
	
	public ListNode(int data) {
		this.data = data;
		this.next = null;
		
	}
}

public void insertFirst(int value) {
	ListNode newNode = new ListNode(value);
	newNode.next = head;
	head = newNode;
}

public ListNode deleteFirst() {
	if(head == null) { // if head point to null
		return null; 
	}
	ListNode deleted = head; // assign deleted node to head
	head = head.next; // head will pointed to next node
	deleted.next = null; // break link between 1st node and 2nd node
	return deleted;
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
		// Creating Singly Linked List
		LinkedListExample07 sll = new LinkedListExample07();
		sll.insertFirst(3);
		sll.insertFirst(2);
		sll.insertFirst(1);
		sll.display();
		
		System.out.println(sll.deleteFirst().data); // printing the returned data
		System.out.println(sll.deleteFirst().data);
		sll.display();

	}

}
