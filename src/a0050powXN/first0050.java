package a0050powXN;

public class first0050 {
    public double myPow(double x, int n) {
        long N = n;
        return N >= 0 ? quickMul(x, N) : 1.0 / quickMul(x, -N);
    }

    private double quickMul(double x, long n) {
        double ans=1;
        double x_contrib=x;
        while (n>0){
            if (n%2==1){
                ans*=x_contrib;
            }
            x_contrib*=x_contrib;
            n/=2;
        }
        return ans;
    }
}
