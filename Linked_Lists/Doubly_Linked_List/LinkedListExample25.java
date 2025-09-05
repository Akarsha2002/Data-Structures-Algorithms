package DSA_Using_Java.Linked_Lists.Doubly_Linked_List;

import java.util.NoSuchElementException;

// How to delete first node in a Doubly Linked List

public class LinkedListExample25 {
	private ListNode head;
	private ListNode tail;
	private int length;
	
private class ListNode {
	private int data;
	private ListNode previous;
	private ListNode next;
	
	public ListNode(int data) {
		this.data = data;
	}
}

public LinkedListExample25() {
	this.head = null;
	this.tail = null;
	this.length = 0;
}

public boolean isEmpty() {
	return head == null; // length == 0
}

public void insertFirst(int value) {
	ListNode newNode = new ListNode(value);
	
	if(isEmpty()) {
		tail = newNode;
	}
	else {
		head.previous = newNode;
	}
	newNode.next = head;
	head = newNode;
	length++;
}

public ListNode deleteFirst() {
	if(isEmpty()) { // Checking DLL is empty
		throw new NoSuchElementException(); // throw NoSuchElementException()
	}
	ListNode temp = head; // temp node start from head
	if(head == tail) { // head & tail pointing to last node
		tail = null;
	}else {
		head.next.previous = null; // break the link of head's next previous reference 
	}
	head = head.next; // shifting head pointer to next reference
	temp.next = null; // break the link of temp's next reference
	length--; // decrease the length of DLL
	return temp; // returns remaining DLL
}

public void display() {
	ListNode current = head;
	while(current != null) {
		System.out.print(current.data+" <--> ");
		current = current.next;
	}
	System.out.println("null");
}
	public static void main(String[] args) {
		/*
		 *                head           tail
		 *                 |              |
		 * input: null <-- 1 <--> 10 <--> 15 --> null
		 * 
		 *                 head    tail
		 *                  |       |
		 * output: null <-- 10 <--> 15 --> null
		 * 
		 * 
		 */
		
		// Creating Doubly Linked List
		LinkedListExample25 dll = new LinkedListExample25();
		dll.insertFirst(15);
		dll.insertFirst(10);
		dll.insertFirst(1);
		dll.display();
		
		dll.deleteFirst();
		dll.deleteFirst();
		dll.deleteFirst();
		dll.deleteFirst();
		dll.display();
	}

}
