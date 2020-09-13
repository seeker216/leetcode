package a0542matrix01;

import java.util.LinkedList;
import java.util.Queue;

public class first0542 {
    public int[][] updateMatrix(int[][] matrix) {
        int row=matrix.length,col=matrix[0].length;
        int[][] ans=new int[row][col];
        boolean[][] visited=new boolean[row][col];
        Queue<int[]> queue=new LinkedList<>();
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if (matrix[i][j]==0){
                    ans[i][j]=0;
                    visited[i][j]=true;
                    queue.offer(new int[]{i,j});
                }
            }
        }
        int[][] direction={{-1,0},{1,0},{0,-1},{0,1}};
        while (!queue.isEmpty()){
            int[] poll=queue.poll();
            int i=poll[0],j=poll[1];
            for (int k=0;k<4;k++){
                int di=i+direction[k][0],dj=j+direction[k][1];
                if (di>=0&&di<row&&dj>=0&&dj<col&&!visited[di][dj]){
                    ans[di][dj]=ans[i][j]+1;
                    visited[di][dj]=true;
                    queue.offer(new int[]{di,dj});
                }
            }
        }
        return ans;
    }
}
