package a0461hammingDis;

public class first0461 {
    public static void main(String[] args) {
        System.out.println(new Solution().hammingDistance(1,4));
    }
}
class Solution {
    public int hammingDistance(int x, int y) {
        String bx=Integer.toBinaryString(x>y?x:y),by=Integer.toBinaryString(x<y?x:y);
        int dis=0;
        int i=bx.length()-1,j=by.length()-1;
        while (i>=0||j>=0){
            if (i<0){
                dis=by.charAt(j)=='1'?dis+1:dis;
                j--;
            }else if (j<0){
                dis=bx.charAt(i)=='1'?dis+1:dis;
                i--;
            }else {
                if (bx.charAt(i) != by.charAt(j)) {
                    dis++;
                }
                i--;
                j--;
            }
        }
        return dis;
    }
}