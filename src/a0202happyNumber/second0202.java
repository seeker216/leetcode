package a0202happyNumber;

public class second0202 {
    public boolean isHappy(int n) {
        int slowRunner=n;
        int fastRunner=sqSumN(n);
        while (fastRunner!=1&&fastRunner!=slowRunner){
            slowRunner=sqSumN(slowRunner);
            fastRunner=sqSumN(sqSumN(fastRunner));
        }
        return fastRunner==1;
    }
    private int sqSumN(int n) {
        int ans=0;
        while (n>0){
            ans+=(Math.pow(n%10,2));
            n=n/10;
        }
        return ans;
    }
}
