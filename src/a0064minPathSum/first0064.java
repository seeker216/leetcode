package a0064minPathSum;

public class first0064 {
    /**
     * 从右下角往左上角，dp解决
     * @param grid
     * @return
     */
    public static int minPathSum(int[][] grid) {
        if (grid.length<1||grid[0].length<1)
            return 0;
        int row=grid.length-1,col=grid[0].length-1;
        int[][] ans=new int[row+1][col+1];
        ans[row][col]=grid[row][col];
        for (int i=row-1;i>=0;i--)
            ans[i][col]=ans[i+1][col]+grid[i][col];
        for (int i=col-1;i>=0;i--)
            ans[row][i]=ans[row][i+1]+grid[row][i];
        for (int i=row-1;i>=0;i--){
            for (int j=col-1;j>=0;j--){
                ans[i][j]=Math.min(ans[i+1][j],ans[i][j+1])+grid[i][j];
            }
        }
        return ans[0][0];
    }

    public static void main(String[] args) {
        int[][] grid=new int[][]{{1,3,1},{1,5,1},{4,2,1}};
        System.out.println(minPathSum(grid));
    }
}
