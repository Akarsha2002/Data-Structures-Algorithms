package DSA_Using_Java.Stack;


import java.util.Arrays;
import java.util.Stack;

// Next Greater Element

public class StackExample04 {
public static int[] nextGreaterElement(int[] array) {
	int[] result = new int[array.length];
	Stack<Integer> stack = new Stack<Integer>();
	
	// Loop from right to Left
	for(int i = array.length - 1; i >= 0; i--) {
		
		// Pop all smaller or equal elements
	    while(!stack.empty() && stack.peek() <= array[i]) {
			stack.pop();
		}
		
	    // If stack is empty -> No greater element
	    if(stack.empty()) {
			result[i] = -1;
		}
	    
	    // Else top of stack is next greater
		else {
			result[i] = stack.peek();
		}
	    
	   
	      // Ternary Operator instead of if-else
	      // result[i] = stack.empty() ? -1 : stack.peek();
	   
	    
	    // Push current element into the stack
		stack.push(array[i]);
	}
	return result;
}

	public static void main(String[] args) {
		/*
		 * Given an array of integers. For each element of an array,
		 * find its next greater element in that array.
		 * The next greater element is the first element towards right,
		 * which is greater than the current element.
		 * 
		 * Example:
		 *    input: array = {4, 7, 3, 4, 8, 1}
		 *    output: array = {7, 8, 4, 8, -1, -1}
		 * 
		 */
		
		int[] array = {4, 7, 3, 4, 8, 1};
		int[] result = nextGreaterElement(array);
		
		// Print the array properly
		System.out.println(Arrays.toString(result));
	}
}
