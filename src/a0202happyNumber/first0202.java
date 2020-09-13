package a0202happyNumber;

import java.util.HashSet;
import java.util.Set;

public class first0202 {
    public boolean isHappy(int n) {
        Set<Integer> set=new HashSet<>();
        int sumN=sqSumN(n);
        while (!set.contains(sumN)){
            set.add(sumN);
            if (sumN==1)
                return true;
            sumN=sqSumN(sumN);
        }
        return false;
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
