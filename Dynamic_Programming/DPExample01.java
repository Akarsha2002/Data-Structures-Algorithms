package DSA_Using_Java.Dynamic_Programming;

// Fibonacci Series - Dynamic Programming
// Tabulation Method - Bottom u

public class DPExample01 {
	
	public int fib(int n) {
		int[] table = new int[n + 1];
		table[0] = 0;
		table[1] = 1;
		
		for(int i = 2; i <= n; i++) {
			table[i] = table[i - 1] + table[i - 2];
		}
		
		return table[n];
	}
	
	public static int fact(int n) {
		int[] factorial = new int[n + 1];
		factorial[0] = 1;
		
		for(int i = 1; i <= n; i++) {
			factorial[i] = i * factorial[i - 1];
		}
		
		return factorial[n];
	}
	
	public static void main(String[] args) {
		/*
		 * Recursion Algorithm of Fibonacci Series
		 * This is less efficient way
		 * 
		 * public int fib(int n) {
		 *     if(n == 0) return 0;
		 *     if(n == 1) return 1;
		 *     int left = fib(n-1);
		 *     int right = fib(n-2);
		 *     return left + right;
		 * }
		 * 
		 */
		
		DPExample01 dp01 = new DPExample01();
		System.out.println("The 5th fibonacci number is "+dp01.fib(5)); // 0, 1, 1, 2, 3, 5
		System.out.println("The value of 5! is "+fact(5)); // 1 × 2 × 3 × 4 × 5 = 120 

	}
}										