package a0994rottingOranges;

public class first0994 {
    public static int orangesRotting(int[][] grid) {
        int ans=0;
        int row=grid.length,col=grid[0].length;
        boolean fresh;
        do{
            fresh=false;
            int[][] tmp=new int[row][col];
            System.arraycopy(grid,0,tmp,0,row);
            for(int i=0;i<row;i++){
                for(int j=0;j<col;j++){
                    if(grid[i][j]==1){
                        fresh=true;
                    }else if(grid[i][j]==2){
                        if(i>0&&grid[i-1][j]==1)
                            tmp[i-1][j]=2;
                        if(j>0&&grid[i][j-1]==1)
                            tmp[i][j-1]=2;
                        if(i+1<row&&grid[i+1][j]==1)
                            tmp[i+1][j]=2;
                        if(j+1<col&&grid[i][j+1]==1)
                            tmp[i][j+1]=2;
                    }
                }
            }
            grid=tmp;
            ans=fresh?ans+1:ans;
        }while(fresh);
        return ans;
    }

    public static void main(String[] args) {
        int[][] p=new int[][]{{2,1,1},{1,1,0},{0,1,1}};
        System.out.println(orangesRotting(p));
    }
}
