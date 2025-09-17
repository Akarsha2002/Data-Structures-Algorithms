package DSA_Using_Java.Stack;

import java.util.Scanner;
import java.util.Stack;

// How to reverse a String using a Stack

public class StackExample03 {
	public static String reverse(String str) {
		Stack<Character> stack = new Stack<Character>(); // Creating Stack Object
		char[] chars = str.toCharArray(); // Converting String -> toCharArray() & stored in char[]

		for (char c : chars) { // pushing characters of string one by one to stack
			stack.push(c);
		}

		for (int i = 0; i < str.length(); i++) { // popping elements from the stack & store in char[]
			chars[i] = stack.pop();
		}
		return new String(chars); // return the reversed String(char[])
	}

	public static void main(String[] args) {
		/*
		 * Input: "ABCD"
		 * 
		 * Output: "DCBA"
		 * 
		 */
		
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter String want to reverse: ");
		String str = sc.nextLine();

		System.out.println("String Before Reverse: " + str);
		System.out.println("String After Reverse: " + reverse(str));
		
		sc.close();
	}
}
