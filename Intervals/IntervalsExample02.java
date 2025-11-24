package DSA_Using_Java.Intervals;

import java.util.LinkedList;
import java.util.List;
import static java.util.Comparator.comparingInt;

import java.util.ArrayList;
// Merge Intervals

public class IntervalsExample02 {
	
	private int start;
	private int end;
	
	public IntervalsExample02() {
		this.start = 0;
		this.end = 0;
	}
	
	public IntervalsExample02(int start, int end) {
		this.start = start;
		this.end = end;
	}
	
	@Override
	public String toString() {
		return "{" + start +","+ end + "}";
	}
	
	public List<IntervalsExample02> merge(List<IntervalsExample02> intervals) {
		// If the list has 0 or 1 interval, no merging is needed
		if(intervals.size() < 2) {
			return intervals;
		}
		
		intervals.sort(comparingInt(interval -> interval.start)); // Sort intervals by their starting time
		List<IntervalsExample02> result = new LinkedList<>(); // Prepare a list to hold merged intervals
		
		// Take the first interval as the initial "merged" range
		IntervalsExample02 first = intervals.get(0);
		int start = first.start;
		int end = first.end;
		
		// Traverse all intervals one by one
		for(int i = 1; i < intervals.size(); i++) {
			IntervalsExample02 current = intervals.get(i);
			
			// Overlapping intervals
			if(current.start <= end) {
				end = Math.max(current.end, end); // // Extend the current merged interval
			}
			
			// Non-overlapping intervals
			else {
				result.add(new IntervalsExample02(start, end)); // // Add the finished merged interval to the result list
				
				// Start a new interval
				start = current.start;
				end = current.end;
			}
		}
		
		// Add the last merged interval
		result.add(new IntervalsExample02(start, end)); 
		return result;
		
	}

	public static void main(String[] args) {
		/*
		 * Q. Given a list of intervals, merge all the overlapping 
		 * intervals and return a list of non-overlapping intervals.
		 * 
		 * Example - 
		 *   Input: intervals = [{2, 6}, {1, 3}, {8, 10}]
		 *   Output: [{1, 6}, {8, 10}]
		 *   
		 *   1. Sort the interval based on start time (a.start <= b.start)
		 *   2. c.start = a.start
		 *   3. c.end = Math.max(a.end, b.end);
		 *   4. Repeat for all overlapping intervals
		 *   
		 */
		
		IntervalsExample02 interval02 = new IntervalsExample02();
		List<IntervalsExample02> intervals = new ArrayList<>();
		intervals.add(new IntervalsExample02(2, 6));
		intervals.add(new IntervalsExample02(1, 3));
		intervals.add(new IntervalsExample02(8, 10));
		
		List<IntervalsExample02> merged = interval02.merge(intervals);
		
		System.out.println("Merged Intervals: "+merged);
		
	}
}
