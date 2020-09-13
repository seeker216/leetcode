package a0343integerBreak;

public class first0343 {
    public static void main(String[] args) {
        System.out.println(new Solution().integerBreak(7));
    }
}
class Solution {
    /*
    递归
     */
    public int integerBreak(int n) {
        if (n==2)
            return 1;
        else if (n==3)
            return 2;
        else
            return myBreak(n);
    }

    private int myBreak(int n) {
        if (n<4)
            return n;
        else {
            return Math.max(2*myBreak(n-2),3*myBreak(n-3));
        }
    }
}