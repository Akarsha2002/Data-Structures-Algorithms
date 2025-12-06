package DSA_Using_Java.Dynamic_Programming;

// Fibonacci Series - Dynamic Programming
// Memorization Method - Top Down Approach

public class DPExample02 {
	
	public int fib(int[] memo, int n) {
		if(memo[n] == 0) {
			if(n < 2) {
				memo[n] = n;
			}
			else {
				int left = fib(memo, n - 1);
				int right = fib(memo, n - 2);
				return left + right;
			}
		}
		
		return memo[n];
	}
	
	public static int fact(int[] memo, int n) {
		if(memo[n] == 0) {
			if(n == 0 || n == 1) {
				memo[n] = 1;
			}
			else {
				return n * fact(memo, n - 1);
			}
		}
		
		return memo[n];
	}
	public static void main(String[] args) {
		/*
		 * int[] array[] = new int[n];
		 * default array[] = {0, 0, 0.....n times 0};
		 */
		
		int n = 7;
		DPExample02 dp02 = new DPExample02();		
		System.out.println("The 7th fibonacci number is "+dp02.fib(new int[n + 1], n)); // 0, 1, 1, 2, 3, 5, 8, 13
		System.out.println("The value of 7! is "+fact(new int[n + 1], n));
		
	} 	
}																