package DSA_Using_Java.LeetCode;

import java.util.Set;

// Remove Vowels from the string

public class RemoveVowels {
	
	// Below written code is inefficient
	public static void removeVowels01(String str) {
		char[] chars = str.toCharArray();
		for(char c : chars) {
			if(c != 'a' && c != 'e' && c != 'i' && c != 'o' && c != 'u') {
				System.out.print(c);
			}
		}
	}
	
	// Efficient Code - time complexity O(1)
	public String removeVowels02(String str) {
		Set<Character> vowels = Set.of('a', 'e', 'i', 'o', 'u'); // Define set of vowels
		StringBuilder sb = new StringBuilder(); // StringBuilder
		
		char[] chars = str.toCharArray(); // string is converted into characterArray()
		// for(char c : chars) { // This also OK
		
		// Traversing each characters present in the string
		for(Character c : chars) {
			if(!vowels.contains(c)) { // comparing set of vowels with characters then remove it
				sb.append(c); // append only consonants in the StringBuilder Method
			}
		}
		return sb.toString(); // return the consonant string
	}
	
	public static void main(String[] args) {
		/*
		 * Q. Given a string, remove the vowels from the 
		 * string and return the string without vowels. 
		 * The string will contains lower case letters.
		 * 
		 * Example - 
		 *    Input: str = "what is your name ?"
		 *    Output: "wht s yr nm ?"
		 *    Explanation: After removing vowels i.e. {'a', 'e', 'i', 'o', 'u'}, 
		 *         the string becomes "wht s yr nm ?"
		 *    
		 */
		
		removeVowels01("akarsha p");
		System.out.println();
		
		RemoveVowels rv = new RemoveVowels();
		String result = rv.removeVowels02("ice cream");
		System.out.println(result);
		
	}
}
		