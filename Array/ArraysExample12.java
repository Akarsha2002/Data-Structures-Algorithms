package DSA_Using_Java.Array;
// How to check if a String is a Palindrome or not

// return boolean values

public class ArraysExample12 {
	public boolean isPalindrome(String word) {
		char[] characters = word.toCharArray(); // Converting String to Character Array
		int start = 0;
		int end = characters.length - 1;
		while (start < end) {
			if (characters[start] != characters[end]) {
				return false;
			}
			start++;
			end--;
		}
		return true;
	}

	public static void main(String[] args) {
		/*
		 * Given a string, the task is check whether given string is palindrome or not
		 * 
		 * Example - Given string - "madam" Solution - It should return - true
		 * 
		 * Example - Given string - "that" Solution - It should return - false
		 * 
		 */

		ArraysExample12 a = new ArraysExample12();
		String word = "madam";
		
		if(a.isPalindrome(word)) {
			System.out.println("The "+word+" is palindrome.");
		}
		else {
			System.out.println("The "+word+" is not palindrome.");
		}

	}
}
