package DSA_Using_Java.Linked_Lists.Circular_Singly_Linked_List;
// How to traverse and print a Circular Singly Linked List

public class LinkedListExample28 {
	private ListNode last;
	private int length;
	
	private class ListNode {
		private int data;
		private ListNode next;
		
		public ListNode(int data) {
			this.data = data;
		}
	}
	
	public LinkedListExample28() {
		this.last = null;
		this.length = 0;
	}
	
	public void createCircularLinkedList() {
		ListNode first = new ListNode(1);
		ListNode second = new ListNode(8);
		ListNode third = new ListNode(10);
		ListNode fourth = new ListNode(16);
		
		first.next = second;
		second.next = third;
		third.next = fourth;
		fourth.next = first;
		
		last = fourth;
		
	}
	
	public void display() {
		if(last == null) { // Checking CLL is empty
			return; // come out from method
		}
		else{
			ListNode first = last.next; // first pointer assigned to starting point
			while(first != last) { // traverse the CLL till last
				System.out.print(first.data+" --> ");
				first = first.next; // shifting first pointer to its next position
			}
			System.out.println(first.data+" "); // if first pointer == last pointer printing last ListNode present in the CLL
		}
	}
	public static void main(String[] args) {
		/*
		 *                     last
		 *                      |
		 *  --> 1 -> 8 -> 10 -> 16 --
		 * |_________________________|
		 * 
		 */
		
		// Creating Circular Singly Linked List
		LinkedListExample28 cll = new LinkedListExample28();
		cll.createCircularLinkedList();
		cll.display();

	}

}
