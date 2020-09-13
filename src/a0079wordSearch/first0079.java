package a0079wordSearch;

public class first0079 {

    public static void main(String[] args) {
        Solution s=new Solution();
        char[][] ch=new char[][]{{'A','B','C','E'},{'S','F','C','S'},{'A','D','E','E'}};
        String str="ABCCED";
        s.exist(ch,str);
    }
}
class Solution {
    int n,row,col;
    char[][] board;
    boolean[][] marked;
    String word;
    int[][] direction=new int[][]{{-1,0},{1,0},{0,-1},{0,1}};
    public boolean exist(char[][] board, String word) {
        this.word=word;
        this.board=board;
        row=board.length;
        if (row==0) return false;
        col=board[0].length;
        marked=new boolean[row][col];
        n=word.length();
        for (int i=0;i<row;i++){
            for (int j=0;j<col;j++){
                if (dfs(i,j,0)){
                    return true;
                }
            }
        }
        return false;
    }

    private boolean dfs(int x, int y, int start) {
        if (start==n-1)
            return word.charAt(start)==board[x][y];
        if (word.charAt(start)==board[x][y]){
            marked[x][y]=true;
            for (int k=0;k<4;k++){
                int tmpX=x+direction[k][0];
                int tmpY=y+direction[k][1];
                if (inArea(tmpX,tmpY)&&!marked[tmpX][tmpY]){
                    if (dfs(tmpX,tmpY,start+1))
                        return true;
                }
            }
            marked[x][y]=false;
        }
        return false;
    }

    private boolean inArea(int x, int y) {
        return x>=0&&x<row&&y>=0&&y<col;
    }

}
