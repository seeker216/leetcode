package a0085maxRect;

import java.util.Arrays;

public class second0085 {
}
class Solution2 {
    /*

     */
    public int maximalRectangle(char[][] matrix) {
        int row=matrix.length;
        if(matrix==null||row==0) return 0;
        int col=matrix[0].length;
        int[] height=new int[col];
        int[] left=new int[col];
        int[] right=new int[col];
        Arrays.fill(right,col);
        int maxarea=0;
        for (int i=0;i<row;i++){
            int currLeft=0,currRight=col;
            for (int j=0;j<col;j++){
                height[j]=matrix[i][j]=='1'?height[j]+1:0;
            }

            for (int j=0;j<col;j++){
                if (matrix[i][j]=='1'){
                    left[j]=Math.max(left[j],currLeft);
                }else {
                    left[j]=0;
                    currLeft=j+1;
                }
            }

            for (int j=col-1;j>=0;j--){
                if (matrix[i][j]=='1'){
                    right[j]=Math.min(right[j],currRight);
                }else {
                    right[j]=col;
                    currRight=j;
                }
            }

            for (int j=0;j<col;j++){
                maxarea=Math.max(maxarea,height[j]*(right[j]-left[j]));
            }
        }
        return maxarea;
    }
}