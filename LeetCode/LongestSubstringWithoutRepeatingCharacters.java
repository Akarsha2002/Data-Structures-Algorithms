package DSA_Using_Java.LeetCode;

import java.util.HashMap;
import java.util.Map;

// Longest Substring Without Repeating Characters

public class LongestSubstringWithoutRepeatingCharacters {
	
	public static int lengthOfLongestSubstring(String str) {
		 // HashMap stores character → its latest index in the string
		Map<Character, Integer> map = new HashMap<>();
		
		int maxLength = 0; // stores longest window size found
		int start = 0; // left boundary of the sliding window
		
		// Expand the window by moving 'end'
		for(int end = 0; end < str.length(); end++) {
			char rightChar = str.charAt(end); // current character at right boundary
			
			// If character already seen → shrink window from the left
			if(map.containsKey(rightChar)) {
				/*
				 *  Move start to the RIGHT of previous occurrence
				 *  Ensures substring has no duplicate characters
				 *  
				 */
				start = Math.max(start, map.get(rightChar) + 1);
			}
			
			map.put(rightChar, end); // Update last index of current character
			maxLength = Math.max(maxLength, end - start + 1); // Update maximum window size found so far
		}
		
		return maxLength;
	}
	
	public static void main(String[] args) {
		/*
		 * Q. Given a string str, find the length of longest substring
		 *  without repeating characters.
		 * 
		 *  Example - 
		 *    Input: str = "abcabcbb"
		 *    Output: 3
		 *    
		 *    Input: str = "bbbb"
		 *    Output: 1
		 *    
		 *    Input: str = "pwwkew"
		 *    Output: 3
		 *    
		 *    n = number of characters
		 *    Number of substrings = n(n+1)/2
		 *    
		 *    not need to shift starting point
		 *    
		 */
		
		System.out.println(lengthOfLongestSubstring("abcabcbb"));
		System.out.println(lengthOfLongestSubstring("bbbb"));
		System.out.println(lengthOfLongestSubstring("pwwkew"));
	}
}
