package a0221maxSquare;

public class first0221 {
    /*
    暴力法
     */
    public int maximalSquare(char[][] matrix) {
        int area=0;
        int row=matrix.length;
        int col=matrix[0].length;
        for (int i=0;i<row;i++){
            for (int j=0;j<col;j++){
                if (matrix[i][j]=='1'){
                    area=Math.max(area,compute(matrix,i,j));
                }
            }
        }
        return area;
    }

    private int compute(char[][] matrix, int x, int y) {
        int sideLen=0;
        int area=0;
        for (int i=x;matrix[i][y]=='1';i++){
            sideLen++;
        }
        while (sideLen>0){

        }
        return area;
    }
}
