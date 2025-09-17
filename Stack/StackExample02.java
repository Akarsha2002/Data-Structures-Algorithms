package DSA_Using_Java.Stack;
// Implement Stack with an Array

public class StackExample02 {

	private int top;
	private int[] array;

	public StackExample02(int capacity) { // Parameterized Constructor
		top = -1;
		array = new int[capacity];
	}

	public StackExample02() { // Default Constructor
		this(10); // default value
	}

	public void push(int value) {
		if (isFull()) {
			throw new RuntimeException("Stack is Full!!!");
		} else {
			top++;
			array[top] = value;
		}
	}

	public int pop() {
		if (isEmpty()) {
			throw new RuntimeException("Stack is Empty!!!");
		} else {
			int result = array[top];
			top--;
			return result;
		}
	}

	public int peek() {
		if (isEmpty()) {
			throw new RuntimeException("Stack is Empty!!!");
		} else {
			return array[top];
		}
	}

	public int size() {
		return top + 1;
	}

	public boolean isFull() {
		return array.length == size();
	}

	public boolean isEmpty() {
		return top < 0;
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
		StackExample02 stack = new StackExample02(3);
		stack.push(5);
		stack.push(10);
		stack.push(15);
//		stack.push(20);
		
		System.out.println(stack.pop());
		System.out.println(stack.peek());
		
		System.out.println(stack.pop());
		System.out.println(stack.peek());
		
		System.out.println(stack.pop());
		System.out.println(stack.peek());
		
	}
}
