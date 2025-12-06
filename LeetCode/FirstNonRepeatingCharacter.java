package DSA_Using_Java.LeetCode;

import java.util.HashMap;
import java.util.Map;

public class FirstNonRepeatingCharacter {

	public static int frstNonRptngChar(String str) {
		char[] chars = str.toCharArray(); // String converted into charArray
		Map<Character, Integer> characterFrequencyMap = new HashMap<>();
		
		// Traversing charArray
		// getOrDefault() -> method used to assign 1
		// if is already there character value incremented by 1
		for(char ch : chars) {
			characterFrequencyMap.put(ch, characterFrequencyMap.getOrDefault(ch, 0) + 1); // mapping character to no of times character repeated
		}
		
		// Traverse the charArray 
		for(int i = 0; i < chars.length; i++) {
			char ch = chars[i]; // Accessing character one by one
			
			// if character repeat only 1 it return the index
			if(characterFrequencyMap.get(ch) == 1) {
				return i;
			}
		}
		return -1; // else return -1
	}
	
	public static void main(String[] args) {
		/*
		 * Q. Given a string s, return the index of first
		 *    non-repeating character in it. If it does not,
		 *    return -1. The string will only contain lower case
		 *    letters.
		 *    
		 *    Example - 
		 *      Input: str = "codeforcode"
		 *      Output: 4
		 *      Explaination: The first non-repeating characters is 
		 *      'f' and is found at index 4
		 *      
		 *      Input: str = "aabb"
		 *      Output: -1
		 *      Explaination: It doesn't have any non repeating character.
		 *      
		 */
		
		System.out.println("First Non Repeating Character index of \"codeforcode\" : "+frstNonRptngChar("codeforcode"));
		System.out.println("First Non Repeating Character index of \"abab\" : "+frstNonRptngChar("abab"));
		
	}
} 															