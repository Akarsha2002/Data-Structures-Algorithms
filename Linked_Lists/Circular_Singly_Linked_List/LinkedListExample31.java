package DSA_Using_Java.Linked_Lists.Circular_Singly_Linked_List;

import java.util.NoSuchElementException;

// How to remove first node from a Circular Singly Linked List

public class LinkedListExample31 {
	
	private ListNode last;
	private int length;

	private class ListNode {
		private int data;
		private ListNode next;

		public ListNode(int data) {
			this.data = data;
		}
	}

	public LinkedListExample31() {
		this.last = null;
		this.length = 0;
	}
	
	public boolean isEmpty() {
		return length == 0; // last == null
	}
	
	public int length() {
		return length;
	}
	
	public void insertFirst(int value) {
		ListNode newNode = new ListNode(value);
		if(isEmpty()) {
			last = newNode;
		}
		else {
			newNode.next = last.next;
		}
		last.next = newNode;
		length++;
	}
	
	// not return ListNode return data of that node
	public int removeFirst() {
		if(isEmpty()) { // checking CLL is empty
			throw new NoSuchElementException("Circular Linked List is empty");
		}
		ListNode temp = last.next; // temp variable assigned to last's next reference
		int result = temp.data; // temp's node data return as result
		if(last.next == last) { // traveled at last node
			last = null;
		}
		else {
			last.next = temp.next; // assigning new first node
		}
//		temp.next = null;
		length--; // length decremented
		return result;
	}
	
	public void display() {
		if(isEmpty()) {
			return;
		}
		else {
			ListNode first = last.next;
			while(first != last) {
				System.out.print(first.data+" --> ");
				first = first.next;
			}
			System.out.println(first.data);
		}
	}

	public static void main(String[] args) {
		/*
		 *                      
		 *                      last
		 *                       |   
		 * input:  --> 1 -> 8 -> 10 --
		 *        |___________________|
		 * 
		 * output: 1
		 * 
		 *                 last
		 *                  |   
		 * input:  --> 8 -> 10 --
		 *        |______________|
		 * 
		 */
		
		// Creating Circular Singly Linked List
		LinkedListExample31 cll = new LinkedListExample31();
		cll.insertFirst(15);
		cll.insertFirst(10);
		cll.insertFirst(5);
		cll.insertFirst(1);
		cll.display();
		
		System.out.println(cll.removeFirst());
		cll.display();
		
		
		
		
	}
}
