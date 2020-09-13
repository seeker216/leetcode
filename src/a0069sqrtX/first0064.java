package a0069sqrtX;

public class first0064 {

    public static int mySqrt(int x) {
        int ans=0;
        int left=0,right=x;
        while (left<=right){
            int mid=left+(right-left)/2;
            if ((long)mid*mid<=x){
                ans=mid;
                left=mid+1;
            }else {
                right=mid-1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(mySqrt(1));
    }
}
