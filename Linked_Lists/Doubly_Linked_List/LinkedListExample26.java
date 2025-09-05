package DSA_Using_Java.Linked_Lists.Doubly_Linked_List;

import java.util.NoSuchElementException;

// How to delete last node in a Doubly Linked List

public class LinkedListExample26 {
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

public LinkedListExample26() {
	this.head = null;
	this.tail = null;
	this.length = 0;
}

public boolean isEmpty() {
	return head == null; // length == 0
}

public void insertLast(int value) {
	ListNode newNode = new ListNode(value);
	
	if(isEmpty()) {
		head = newNode;
	}
	else {
		tail.next = newNode;
		newNode.previous = tail;
	}
	tail = newNode;
	length++;
}

public void display() {
	if(isEmpty()) {
		return;
	}
	ListNode current = head;
	while(current != null) {
		System.out.print(current.data+" <--> ");
		current = current.next;
	}
	System.out.println("null");
}

public ListNode deleteLast() {
	if(isEmpty()) { // Checking DLL is empty
		throw new NoSuchElementException(); // throw NoSuchElementException()
	}
	ListNode temp = tail; // temp node start from tail
	if(head == tail) { // head & tail pointing to first node
		head = null;
	}
	else {
		tail.previous.next = null; // break the link of tail's previous next reference 
	}
	tail = tail.previous; // shifting head pointer to previous reference
	temp.previous = null; // break the link of temp's previous reference
	length--; // decrease the length of DLL
	return temp; // returns remaining DLL
}

	public static void main(String[] args) {
		/*
		 *                head           tail
		 *                 |              |
		 * input: null <-- 1 <--> 10 <--> 15 --> null
		 * 
		 *                 head   tail
		 *                  |      |
		 * output: null <-- 1 <--> 10 --> null
		 * 
		 * 
		 */
		
		// Creating Doubly Linked List
		LinkedListExample26 dll = new LinkedListExample26();
		dll.insertLast(1);
		dll.insertLast(10);
		dll.insertLast(15);
		dll.display();
		
		dll.deleteLast();
		dll.deleteLast();
		dll.deleteLast();
		dll.deleteLast();
		dll.display();
	}

}
