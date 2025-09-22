package DSA_Using_Java.Queue;

import java.util.NoSuchElementException;

// How to remove an element in Queue

public class QueueExample03 {
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

public QueueExample03() {
	this.front = null;
	this.rear = null;
	this.length = 0;
}

public int length() {
	return length = 0;
}

public boolean isEmpty() {
	return length == 0;
}

public void enqueue(int value) {
	ListNode newNode = new ListNode(value);
	if(isEmpty()) {
		front = newNode;
	}
	else {
		rear.next = newNode;
	}
	rear = newNode;
	length++;
}

// Removes and returns the element from the front of the queue
public int dequeue() {
	
	// If the queue is empty, throw an exception
	if(isEmpty()) {
		throw new NoSuchElementException("Queue is empty");
	}
	
	int result = front.data; // Store the value of the front node to return later
	front = front.next; // Move the front pointer to the next node
	
	// If the queue becomes empty, set rear to null as well
	if(front == null) {
		rear = null;
	}
	
	length--; // Reduce the length of the queue
	return result; // Return the removed element
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

public int first() {
	if(isEmpty()) {
		throw new NoSuchElementException("Queue is empty");
	}
	return front.data;
}

public int last() {
	if(isEmpty()) {
		throw new NoSuchElementException("Queue is empty");
	}
	return rear.data;
}
	public static void main(String[] args) {
		/*
		 * 
		 * front                  rear
		 *   |                     |
		 *   10 -> 8 -> 1 -> 11 -> 15 -> null
		 * 
		 * input: 10 -> 15 -> 20 -> null
		 *         |           |
		 *       front        rear
		 *       
		 * output: 10, 15, 20 --> deque()
		 * 
		 * output: first() --> 10, last --> 20
		 * 
		 */
		
		// Creating Queue
		QueueExample03 queue = new QueueExample03();
		queue.enqueue(10);
		queue.enqueue(15);
		queue.enqueue(20);	
		queue.print();
		
//		queue.dequeue();
//		queue.print();
//		
//		queue.dequeue();
//		queue.print();
//		
//		queue.dequeue();
//		queue.print();
//		
//		queue.dequeue();
//		queue.print();
		
		System.out.println(queue.first());
		System.out.println(queue.last());
		
	}
}
