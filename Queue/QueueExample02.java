package DSA_Using_Java.Queue;
// How to insert an element in a Queue

public class QueueExample02 {
	private ListNode front;
	private ListNode rear;
	private int length;
	
private class ListNode {
	private int data;
	private ListNode next;
	
	public ListNode(int data) {
		this.data = data;
		this.next = null;
	}
}

public QueueExample02() {
	this.front = null;
	this.rear = null;
	this.length = 0;
}

public int length() {
	return length;
}

public boolean isEmpty() {
	return length == 0;
}

// Adds an element to the end (rear) of the queue
public void enqueue(int value) {
	
	ListNode newNode = new ListNode(value); // Create a new node with the given value
	
	// If the queue is empty, the new node becomes the front
	if(isEmpty()) {
		front = newNode;
	}
	
	// If not empty, link the new node after the current rear
	else {
		rear.next = newNode;
	}
	
	rear = newNode; // Update the rear to point to the new node
	length++; // Increase the total number of elements in the queue
}

public void print() {
	if(isEmpty()) {
		return;
	}
	else {
		ListNode current = front;
		while(current != null) {
			System.out.print(current.data+" --> ");
			current = current.next;
		}
		System.out.println("null");
	}
}
	public static void main(String[] args) {
		/*
		 * 
		 * front                  rear
		 *   |                     |
		 *   10 -> 8 -> 1 -> 11 -> 15 -> null
		 * 
		 * input: 10 -> null , 15 -> null , 20 -> null
		 * 
		 * output: 10 -> 15 -> 20 -> null
		 *         |           |
		 *       front        rear
		 * 
		 */
		
		// Creating Queue
		QueueExample02 queue = new QueueExample02();
		queue.enqueue(10);
		queue.enqueue(15);
		queue.enqueue(20);
		
		queue.print();
	}

}
