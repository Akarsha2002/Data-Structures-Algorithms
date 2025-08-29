package DSA_Using_Java.Linked_Lists.Singly_Linked_List;
// Add two Singly Linked List

public class LinkedListExample20 {
private ListNode head;

private static class ListNode {
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

public static ListNode addTwoLinkedList(ListNode a, ListNode b) {
	ListNode dummy = new ListNode(0); // creating dummy ListNode
	ListNode tail = dummy; // tail assigned to dummy node
	int carry = 0; // initially carry is 0
	while(a != null || b != null) { // Traversing 2 Linked List Linked List 'a' OR Linked List 'b' is exhausted
		int x = (a != null)? a.data : 0; // x assigned with Linked List a's data OR 0
		int y = (b != null)? b.data : 0; // y assigned with Linked List b's data OR 0
		int sum = carry + x + y;
		carry = sum / 10; // carry assigned with 1st digit of sum
		tail.next = new ListNode(sum % 10); // tail's next reference assigned with ListNode of the value of 2nd digit of the sum
		tail = tail.next; // tail is shifted to next reference
		if(a != null) a = a.next; // traverse the 'a' Linked List till end
		if(b != null) b = b.next; // traverse the 'b' Linked List till end
 	}
	if(carry > 0) {
		tail.next = new ListNode(carry); // tail's next reference assigned with ListNode of the carry value
	}
	return dummy.next; // returning dummy next reference nodes
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
		 * Given two non-empty linked list representing two non-negative integers.
		 * The digits are stored in reverse order, and each of their nodes contains a single digit.
		 * Add the two numbers and return the sum as a linked list.
		 * You may assume the two numbers do not contain any leading zero, except the number 0 itself.
		 * For Example:
		 *      a --> 3 -> 4 -> 3 -> null
		 *      b --> 5 -> 6 -> 4 -> null
		 *   ______________________________
		 * result --> 8 -> 0 -> 8 -> null   
		 * 
		 * calculation: 343 + 465 = 808
		 * 
		 */
		
		// Creating Singly Linked List
		LinkedListExample20 sll1 = new LinkedListExample20();
		sll1.insertFirst(9);
		sll1.insertFirst(4);
		sll1.insertFirst(7);
		sll1.display();
		
		LinkedListExample20 sll2 = new LinkedListExample20();
		sll2.insertFirst(6);
		sll2.insertFirst(5);
		sll2.display();
		
		LinkedListExample20 result = new LinkedListExample20();
		result.head = addTwoLinkedList(sll1.head, sll2.head);
		result.display();
		
	}
}
