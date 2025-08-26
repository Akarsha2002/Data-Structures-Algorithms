package DSA_Using_Java.Linked_Lists.Singly_Linked_List;
// How to search an element in a Linked List

public class LinkedListExample10 {
private ListNode head;

private static class ListNode{
	private int data;
	private ListNode next;
	
	public ListNode(int data) {
		this.data = data;
		this.next = null;
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

public boolean find(ListNode head, int searchKey){ // return boolean parameters: head, searchKey
	if(head == null) { // if no elements in the linked list
		return false;
	}
	else {
		ListNode current = head; // current pointer assigned to head
		while(current != null) { // traverse till end
			if(current.data == searchKey) { // if finds the searchKey
				return true;
			}
			current = current.next; // shift the current pointer to next reference
		}
		return false;
	}
}
	public static void main(String[] args) {
		/*
		 * Creating Singly Linked List
		 * 10 -> 8 -> 1 -> 11 -> null
		 * 10 as head node in LinkedList
		 * 
		 */
		LinkedListExample10 sll = new LinkedListExample10();
		sll.head = new ListNode(10);
		ListNode second = new ListNode(8);
		ListNode third = new ListNode(1);
		ListNode fourth = new ListNode(11);
		
		// connect together to form the chain
		sll.head.next = second;
		second.next = third;
		third.next = fourth;
		
		sll.display();
		
		// finding searchKey Condition
		if(sll.find(sll.head, 12)) {
			System.out.println("Search key is found!!!");
		}
		else {
			System.out.println("Search key is not found!!!");
		}

	}

}
