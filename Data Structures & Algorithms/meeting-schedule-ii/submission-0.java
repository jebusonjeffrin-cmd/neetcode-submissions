/**
 * Definition of Interval:
 * public class Interval {
 *     public int start, end;
 *     public Interval(int start, int end) {
 *         this.start = start;
 *         this.end = end;
 *     }
 * }
 */

class Solution {
    public int minMeetingRooms(List<Interval> intervals) {
        int n = intervals.size();
        int[][] Intervals = new int[2*n][2];
        for(int i=0;i<n;i++){
            Intervals[2*i][0] = intervals.get(i).start;Intervals[2*i][1] = 1;
            Intervals[2*i+1][0] = intervals.get(i).end;Intervals[2*i+1][1] = -1;
        }
        Arrays.sort(Intervals,(a,b)->{
            if(a[0] != b[0])return a[0]-b[0];
            return a[1]-b[1];
        });
        int rooms=0,mxrooms=0;
        for(int[] interval:Intervals){
            rooms += interval[1];
            mxrooms = Math.max(rooms,mxrooms);
        }
        return mxrooms;
    }
}
