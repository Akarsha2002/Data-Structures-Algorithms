package DSA_Using_Java.Stack;

import java.util.Stack;
import java.util.Scanner;

// Valid Parentheses

public class StackExample05 {
	
// Method to check validity of parenthesis
public static boolean isValid(String s) {
	
	// Stack to store opening brackets
	Stack<Character> stack = new Stack<Character>();
	
	// Loop through each character of the string
	for(char c : s.toCharArray()) {
		
		// If the character is an opening bracket, push into the stack
		if(c == '(' || c == '{' || c == '[') {
			stack.push(c);
		}
		
		/*
		 * 
		 * If the character is a closing bracket but stack is empty,
		 * If means there is no matching opening bracket -> invalid
		 * 
		 */
		else if(stack.empty()) {
			return false;
		}
		else {
			
			// Peek at the top element of the stack(last opening bracket)
			char top = stack.peek();
			
			/*
			 * 
			 * If the current closing bracket  matches the top opening bracket,
			 * pop the opening bracket from the stack
			 * 
			 */
			if((c == ')' && top == '(') || (c == '}' && top == '{') || (c == ']' && top == '[')) {
				stack.pop();
			}
			
			// If it doesn't match, string is invalid
			else {
				return false;
			}
		}
	}
	
	/*
	 * 
	 *  If stack is empty at the end
	 *  all brackets matched correctly -> valid
	 *  
	 */
	return stack.empty();
}
	public static void main(String[] args) {
		/*
		 * Given a string s, containing just the characters '(', ')', '[', ']', 
		 * '{', and '}' determine if the input string is valid. An input string is valid.
		 * 
		 * if:
		 *   Open brackets must be closed by same type of brackets.
		 *   Open brackets must be closed in correct order.
		 * 
		 * Example -
		 *   input: str = "{()}" output: true
		 *   input: str = "{]"   output: false
		 *   input: str = "{()"  output: false
		 * 
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter string ( \'(\', \'{\', \'[\', \')\', \'}\', \']\' ): ");
		String s = sc.nextLine();
		
		System.out.println("Is the parenthesis valid: "+isValid(s));
		
		sc.close();

	}
}
