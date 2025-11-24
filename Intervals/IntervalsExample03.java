package DSA_Using_Java.Intervals;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

// LeetCode #57: Insert Interval

public class IntervalsExample03 {
	
	private int start;
	private int end;
	
	public IntervalsExample03() {
		this.start = 0;
		this.end = 0;
	}
	
	public IntervalsExample03(int start, int end) {
		this.start = start;
		this.end = end;
	}
	
	@Override
	public String toString() {
		return "{"+start+","+end+"}";
	}
	
	List<IntervalsExample03> insert(List<IntervalsExample03> intervals, IntervalsExample03 newInterval) {
		// If list is empty, just return list containing newInterval
		if(intervals == null || intervals.isEmpty()) {
			return intervals;
		}
		
		List<IntervalsExample03> result = new LinkedList<>();
		int i = 0;
		
		// Add all intervals that come *before* newInterval (no overlap)
		while(i < intervals.size() && intervals.get(i).end < newInterval.start) {
			result.add(intervals.get(i));
			i++;
		}
		
		// Merge all overlapping intervals with newInterval
		while(i < intervals.size() && intervals.get(i).start <= newInterval.end) {
			IntervalsExample03 current = intervals.get(i);
			current.start = Math.min(current.start, newInterval.start); // extend start
			current.end = Math.max(current.end, current.end); // extend end
			i++;
		}
		result.add(newInterval); // Add a merged interval
		
		// Add the remaining intervals (that come after newInterval)
		while(i < intervals.size()) {
			result.add(intervals.get(i));
			i++;
		}
		
		return result;
	}
	
	public static void main(String[] args) {
		/*
		 * Q. Given a list of non-overlapping intervals sorted by their start time,
		 * insert a given interval at the valid position, merge all the overlapping
		 * intervals and return a list of mutually exclusive intervals.
		 *  Input: intervals = [{1, 3}, {5, 7}, {8, 10}], newInterval = [{4, 9}]
		 *  Output: [{1, 3}, {4, 10}]
		 * 
		 * 1. Skip and add intervals that come before new interval to result
		 * 2. Merge all intervals that overlap with new interval
		 * 3. Add the merged interval to result
		 * 4. Insert the remaining intervals to result
		 * 
		 */
		
		IntervalsExample03 interval03 = new IntervalsExample03();
		List<IntervalsExample03> intervals = new ArrayList<>();
		
		intervals.add(new IntervalsExample03(1, 3));
		intervals.add(new IntervalsExample03(5, 7));
		intervals.add(new IntervalsExample03(8, 10));
		
		IntervalsExample03 newInterval = new IntervalsExample03(4, 9);
		
		List<IntervalsExample03> result = interval03.insert(intervals, newInterval);
		
		System.out.println("After Insertion: "+result);
		
	}
}
