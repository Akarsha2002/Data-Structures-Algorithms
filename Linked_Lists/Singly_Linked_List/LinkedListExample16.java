package DSA_Using_Java.Linked_Lists.Singly_Linked_List;
// How to detect the a loop in the Linked List
// Floyd's  Cycle Detection Algorithm or Tortoise and Hare Algorithm

public class LinkedListExample16 {
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
		if(head == null) {
			head = newNode;
		}
		else {
			ListNode current = head;
			while(null != current.next) {
				current = current.next;
			}
			current.next = newNode;
		}
	}
	
	public boolean containsLoop() {
		// Initially fastPtr and slowPtr s assigned to head 
		ListNode fastPtr = head;
		ListNode slowPtr = head;
		while(fastPtr != null && fastPtr.next != null) { // traversing till end
			// fastPtr shifts twice than slowPtr
			fastPtr = fastPtr.next.next; 
			slowPtr = slowPtr.next;
			
			if(slowPtr == fastPtr) { // if slowPtr and fastPtr lies in same node
				return true; // loop is detected
			}
		}
		return false; // no loop
	}
	
	public void createALoopInLinkedList() {
		ListNode first = new ListNode(1);
		ListNode second = new ListNode(2);
		ListNode third = new ListNode(3);
		ListNode fourth = new ListNode(4);
		ListNode fifth = new ListNode(5);
		ListNode sixth = new ListNode(6);
		
		head = first;
		first.next = second;
		second.next = third;
		third.next = fourth;
		fourth.next = fifth;
		fifth.next = sixth;
		sixth.next = third; // 6th reference assigned to 3rd node
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
		 * head
		 *  |
		 *  1 -> 2 -> 3 -> 4
		 *            ^    |
		 *            |    v
		 *            6 <- 5 
		 * 
		 */
		
		// Creating Singly Linked List
		LinkedListExample16 sll = new LinkedListExample16();
		sll.createALoopInLinkedList();
		System.out.println(sll.containsLoop()); // true
	}

}
