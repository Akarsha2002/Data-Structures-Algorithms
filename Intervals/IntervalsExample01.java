package DSA_Using_Java.Intervals;
// Representing Intervals

public class IntervalsExample01 {
	
	public class Interval {
		private int start;
		private int end;
		
		public Interval(int start, int end) {
			this.start = start;
			this.end = end;
		}
		
		public void print() {
			System.out.printf("Start %d, End %d",start, end);
		}
	}
	
	public static void main(String[] args) {
		// Creating Intervals
		IntervalsExample01 interval01 = new IntervalsExample01();
		IntervalsExample01.Interval interval = interval01.new Interval(1, 3);
		interval.print();

	}
}
