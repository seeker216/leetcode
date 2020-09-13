package a0200numberOfIslands;

public class first0200 {
    static int ans=0;
    public static int numIslands(char[][] grid) {
        if (grid.length==0||grid[0].length==0)
            return ans;
        int row=grid.length,col=grid[0].length;
        boolean[][] visited=new boolean[row][col];
        for (int i=0;i<row;i++){
            for (int j=0;j<col;j++){
                if (!visited[i][j]&&grid[i][j]=='1'){
                    ans++;
//                    visited[i][j]=true;
                    dfs(grid,i,j,visited);
                }
            }
        }
        return ans;
    }
    static void dfs(char[][] grid,int i,int j,boolean[][] visited){
        if (i<0||i>=grid.length||j<0||j>=grid[0].length){
            return;
        }
        if (visited[i][j])
            return;
        visited[i][j]=true;
        if (grid[i][j]=='1') {
            grid[i][j] = '0';
            dfs(grid, i - 1, j, visited);
            dfs(grid, i + 1, j, visited);
            dfs(grid, i, j - 1, visited);
            dfs(grid, i, j + 1, visited);
        }
        return;
    }

    public static void main(String[] args) {
        char[][] grid=new char[][]{{'1','1','0','0','0'},{'1','1','0','0','0'},{'0','0','1','0','0'},{'0','0','0','1','1'}};
        System.out.println(numIslands(grid));
    }
}
