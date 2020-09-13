package a0085maxRect;

public class first0085 {

}

class Solution1 {
    /*
    dp
     */
    public int maximalRectangle(char[][] matrix) {
        int row=matrix.length;
        if(matrix==null||row==0) return 0;
        int col=matrix[0].length;
        int[][] dp=new int[row][col];
        int maxarea=0;
        for (int i=0;i<row;i++){
            for (int j=0;j<col;j++){
                if (matrix[i][j]=='1'){
                    dp[i][j]=j==0?1:dp[i][j-1]+1;
                    int width=dp[i][j];
                    for (int k=i;k>=0;k--){
                        width=Math.min(width,dp[k][j]);
                        maxarea=Math.max(maxarea,width*(i-k+1));
                    }
                }
            }
        }
        return maxarea;
    }
}