package a0695maxAreaOfIsland;

public class first0695 {
    /**
     * 深度优先搜索，沉岛思想
     * @param grid
     * @return
     */
    public static int maxAreaOfIsland(int[][] grid) {
        if (grid.length<1||grid[0].length<1)
            return 0;
        int row=grid.length,col=grid[0].length;
        int ans=0;
        for (int i=0;i<row;i++){
            for (int j=0;j<col;j++){
                ans=Math.max(ans,dfs(grid,i,j));
            }
        }
        return ans;
    }
    static int dfs(int[][] grid,int i,int j){
        if(i<0||j<0||i==grid.length||j==grid[0].length||grid[i][j]!=1)
            return 0;
        grid[i][j]=0;
        int ans=1;
        return ans+dfs(grid,i-1,j)+dfs(grid,i,j-1)+dfs(grid,i+1,j)+dfs(grid,i,j+1);
    }

    public static void main(String[] args) {
        int[][] grid=   {{0,0,1,0,0,0,0,1,0,0,0,0,0},
                        {0,0,0,0,0,0,0,1,1,1,0,0,0},
                        {0,1,1,0,1,0,0,0,0,0,0,0,0},
                        {0,1,0,0,1,1,0,0,1,0,1,0,0},
                        {0,1,0,0,1,1,0,0,1,1,1,0,0},
                        {0,0,0,0,0,0,0,0,0,0,1,0,0},
                        {0,0,0,0,0,0,0,1,1,1,0,0,0},
                        {0,0,0,0,0,0,0,1,1,0,0,0,0}};
        System.out.println(maxAreaOfIsland(grid));
    }
}
