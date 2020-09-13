package a0056mergeIntervals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class first0056 {
    public int[][] merge(int[][] intervals) {
        List<int[]> ans=new ArrayList<>();
        Arrays.sort(intervals,(a,b)->(a[0]-b[0]));//按区间左端点排序
        int i=0;
        while (i<intervals.length){
            int left=intervals[i][0],right=intervals[i][1];
            while (i<intervals.length-1&&intervals[i+1][0]<=right){
                i++;
                right=Math.max(right,intervals[i][1]);
            }
            ans.add(new int[]{left,right});
            i++;
        }
        return ans.toArray(new int[0][]);//将list<int[]>转化成int[][]
    }

    public static void main(String[] args) {
        int[][] intervals=new int[][]{{3,7},{0,3},{6,9},{1,2}};

    }
}
