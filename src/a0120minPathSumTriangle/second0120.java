package a0120minPathSumTriangle;

import java.util.Arrays;
import java.util.List;

public class second0120 {
}
class Solution2 {
    /*
    dp+n空间复杂度
     */
    public int minimumTotal(List<List<Integer>> triangle) {
        int n=triangle.size();
        int[] arr1=new int[n],arr2=new int[n];
        arr1[0]=triangle.get(0).get(0);
        for (int i=1;i<n;i++){
            arr2[0]=arr1[0]+triangle.get(i).get(0);
            for (int j=1;j<i;j++){
                arr2[j]=Math.min(arr1[j],arr1[j-1])+triangle.get(i).get(j);
            }
            arr2[i]=arr1[i-1]+triangle.get(i).get(i);
            arr1=Arrays.copyOfRange(arr2,0,arr2.length);
        }
        int ans=arr1[0];
        for (int i=1;i<n;i++){
            ans=Math.min(ans,arr1[i]);
        }
        return ans;
    }
}