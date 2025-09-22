package DSA_Using_Java.Queue;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

// Generate Binary numbers from 1 to n

public class QueueExample04 {
	
	// Generates the first n binary numbers in sequence using a queue
public static String[] generateBinaryNumbers(int n) {
	
	String[] result = new String[n]; // Array to store the resulting binary numbers
	Queue<String> queue = new LinkedList<String>(); // Queue to generate numbers level by level (like BFS)
	
	queue.offer("1"); // Start with the first binary number
	
	// Generate n binary numbers
	for(int i = 0; i < n; i++) {
		result[i] = queue.poll(); // Remove the front of the queue (smallest binary so far)
		
		// Append "0" and "1" to create the next binary numbers
		String n1 = result[i] + "0";
		String n2 = result[i] + "1";
		
		// Add these new numbers to the queue
		queue.offer(n1);
		queue.offer(n2);
	}
	
	return result; // Return the list of binary numbers
}
	public static void main(String[] args) {
		/*
		 * 
		 * Generate Binary numbers from 1 to n using Queue.
		 * Example -
		 *    input: n = 3
		 *                       1    2     3
		 *    output: result = {"1", "10", "11"}
		 *    
		 *    input: n = 5
		 *                       1    2     3      4      5
		 *    output: result = {"1", "10", "11", "100", "101"}
		 * 
		 */
		
		String[] result = generateBinaryNumbers(7);
		System.out.println(Arrays.toString(result));
		
	}

}
