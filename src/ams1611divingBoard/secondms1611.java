package ams1611divingBoard;

public class secondms1611 {
}
class Solution2 {
    public int[] divingBoard(int shorter, int longer, int k) {
        if (k==0)
            return new int[0];
        if (shorter==longer)
            return new int[]{shorter*k};
        int[] ans=new int[k+1];
        for (int i=0;i<=k;i++){
            ans[i]=i*longer+(k-i)*shorter;
        }
        return ans;
    }
}