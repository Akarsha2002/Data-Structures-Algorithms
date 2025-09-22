package DSA_Using_Java.Queue;
//How to represent a Queue and Implementation

public class QueueExample01 {
private ListNode front;
private ListNode rear;
private int length;

private class ListNode {
	private int data;
	private ListNode next;
	
	public ListNode(int data){
		this.data = data;
		this.next = null;
	}
}

public QueueExample01() {
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

	public static void main(String[] args) {
		/*
		 * 
		 * front                  rear
		 *   |                     |
		 *   10 -> 8 -> 1 -> 11 -> 15 -> null
		 * 
		 * 
		 */
		
		// Creating Queue

	}

}
