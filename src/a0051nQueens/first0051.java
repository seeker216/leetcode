package a0051nQueens;

import java.util.*;

public class first0051 {
}
class Solution {
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> output=new ArrayList<>();
        int[] queens=new int[n];
        Arrays.fill(queens,-1);
        Set<Integer> col=new HashSet<>();
        Set<Integer> dia1=new HashSet<>();
        Set<Integer> dia2=new HashSet<>();
        backtrack(output,queens,n,0,col,dia1,dia2);
        return output;
    }

    private void backtrack(List<List<String>> output, int[] queens, int n, int row, Set<Integer> col, Set<Integer> dia1, Set<Integer> dia2) {
        if(row==n){
            List<String> board = generateBoard(queens, n);
            output.add(board);
        }else{
            for (int i=0;i<n;i++){
                if (col.contains(i))
                    continue;
                int diaIdx1=row-i;
                if (dia1.contains(diaIdx1))
                    continue;
                int diaIdx2=row+i;
                if (dia2.contains(diaIdx2))
                    continue;
                queens[row]=i;
                col.add(i);
                dia1.add(diaIdx1);
                dia2.add(diaIdx2);
                backtrack(output,queens,n,row+1,col,dia1,dia2);
                queens[row]=-1;
                col.remove(i);
                dia1.remove(diaIdx1);
                dia2.remove(diaIdx2);
            }
        }

    }

    private List<String> generateBoard(int[] queens, int n) {
        List<String> board=new ArrayList<>();
        for (int i=0;i<n;i++){
            char[] row=new char[n];
            Arrays.fill(row,'.');
            row[queens[i]]='Q';
            board.add(new String(row));
        }
        return board;
    }
}