package a0130surroundedRegions;

public class first0130 {
}
class Solution {
    public void solve(char[][] board) {
        int n=board.length;
        if(n==0)
            return;
        int m=board[0].length;
        if (m==0)
            return;
        for (int i=0;i<n;i++){
            dfs(board,i,0,n,m);
            dfs(board,i,m-1,n,m);
        }
        for (int j=0;j<m;j++){
            dfs(board,0,j,n,m);
            dfs(board,n-1,j,n,m);
        }
        for (int i=0;i<n;i++){
            for (int j=0;j<m;j++){
                if (board[i][j]=='A')
                    board[i][j]='O';
                else
                    board[i][j]='X';
            }
        }
    }

    private void dfs(char[][] board, int i, int j, int n, int m) {
        if (i<0||j<0||i>=n||j>=m||board[i][j]=='O')
            return;
        board[i][j]='A';
        dfs(board,i-1,j,n,m);
        dfs(board,i+1,j,n,m);
        dfs(board,i,j-1,n,m);
        dfs(board,i,j+1,n,m);
    }

}