package a0240search2dmatrix;

public class first0240 {
    public static void main(String[] args) {
        int[][] a=new int[][]{{-1,3}};
        System.out.println(new Solution().searchMatrix(a,3));
    }
}
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        if(matrix.length<1||matrix[0].length<1){
            return false;
        }
        int m=matrix.length;
        int n=matrix[0].length;
        int i=m-1;
        int j=0;
        while(i>=0&&i<m&&j>=0&&j<n){
            if(matrix[i][j]==target){
                return true;
            }else if(matrix[i][j]>target){
                i--;
            }else{
                j++;
            }
        }
        return false;
    }
}