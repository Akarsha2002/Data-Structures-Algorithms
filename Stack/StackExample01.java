package DSA_Using_Java.Stack;

import java.util.EmptyStackException;

// How to represent Stack and Implementation

public class StackExample01 {
	private ListNode top;
	private int length;
	
    private class ListNode {
	    private int data;
	    private ListNode next;
	    
	    public ListNode(int data) {
	    	this.data = data;
	    }
}
    
    public StackExample01() {
    	this.top = null;
    	this.length = 0;
    }
    
    public int length() {
    	return length;
    }
    
    public boolean isEmpty() {
    	return length == 0; // top == null
    }
    
    public void push(int value) {
    	ListNode newNode = new ListNode(value); // creating node
    	newNode.next = top; // top assigned to newNode's next reference
    	top = newNode; // newNode becomes top 
    	length++; // length incremented
    }
    
    public int pop() {
    	if(isEmpty()) { // checking stack is empty
    		throw new EmptyStackException();
    	}
    	else {
    		int result = top.data; // returns top's data as result
    		top = top.next; // top shifted next element
    		length--; // length decremented
    		return result;
    	}
    }
    
    public int peek() {
    	if(isEmpty()) { // checking stack is empty
    		throw new EmptyStackException();
    	}
    	else {
    		return top.data; // returns data of top node
    	}
    }
     
	public static void main(String[] args) {
		/*
		 * top
		 *  |
		 *  10 -> 8 -> 1 -> 11 -> 15 -> null
		 *  
		 *  input: push() - 10, 15, 20
		 *  
		 *  output: pop() - 20, 15, 10
		 *  
		 *  peek() - 20, 15, 10
		 * 
		 */
		
		// Creating Stack
		StackExample01 stack = new StackExample01();
		stack.push(10);
		stack.push(15);
		stack.push(20);
		
		System.out.println(stack.pop());
		System.out.println(stack.peek());
		
		System.out.println(stack.pop());
		System.out.println(stack.peek());
		
		System.out.println(stack.pop());
		System.out.println(stack.peek());
		
	}
}
