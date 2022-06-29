// class Solution {
//     public int[][] merge(int[][] intervals) {
// //         // List<List<Integer>> result = new ArrayList<List<Integer>>();
// //         List<int []> result= new ArrayList<>();
// //          Arrays.sort(intervals, (a, b) -> a[0] - b[0]);
// //         int i;
// //         for( i=0;i<intervals.length-1;i++)
// //         {
// //             if(intervals[i+1][0]<=intervals[i][1])
// //             {
// //                 // result.add(Arrays.asList(intervals[i][0],intervals[i+1][1]));
// //                 result.add(new int[] {intervals[i][0],Math.max(intervals[i+1][1],intervals[i][1])});
// //                 i++;
// //             }
// //             else
// //             {
// //                 // result.add(Arrays.asList(intervals[i][0],intervals[i][1]));
// //                 result.add(new int[] {intervals[i][0],intervals[i][1]});
// //             }
// //         }
// //         if(i==intervals.length-1) 
// //         {
// //             // result.add(Arrays.asList(intervals[intervals.length-1][0],intervals[intervals.length-1][1]));
// //             result.add(new int[]{intervals[intervals.length-1][0],intervals[intervals.length-1][1]});
// //         }
// //         // System.out.print(result);
// //         // return 
        
// //         return result.toArray(new int[result.size()][]);
        
//         if (intervals.length <= 1)
// 			return intervals;

// 		// Sort by ascending starting point
// 		Arrays.sort(intervals, (i1, i2) -> Integer.compare(i1[0], i2[0]));

// 		List<int[]> result = new ArrayList<>();
// 		int[] newInterval = intervals[0];
// 		result.add(newInterval);
// 		for (int[] interval : intervals) {
// 			if (interval[0] <= newInterval[1]) // Overlapping intervals, move the end if needed
// 				newInterval[1] = Math.max(newInterval[1], interval[1]);
// 			else {                             // Disjoint intervals, add the new interval to the list
// 				newInterval = interval;
// 				result.add(newInterval);
// 			}
// 		}

// 		return result.toArray(new int[result.size()][]);
//     }
    
 
// }


class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
        LinkedList<int[]> merged = new LinkedList<>();
        for (int[] interval : intervals) {
            // if the list of merged intervals is empty or if the current
            // interval does not overlap with the previous, simply append it.
            if (merged.isEmpty() || merged.getLast()[1] < interval[0]) {
                merged.add(interval);
            }
            // otherwise, there is overlap, so we merge the current and previous
            // intervals.
            else {
                merged.getLast()[1] = Math.max(merged.getLast()[1], interval[1]);
            }
        }
        return merged.toArray(new int[merged.size()][]);
    }
}