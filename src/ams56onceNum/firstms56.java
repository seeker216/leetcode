package ams56onceNum;

public class firstms56 {
    public static int[] singleNumbers(int[] nums) {
        int[] ans=new int[2];
        int anb=0;
        for (int i:nums){
            anb^=i;
        }
        int tmp=1;
        while ((tmp&anb)==0){
            tmp<<=1;
        }
        for (int i:nums){
            if ((i&tmp)==0)
                ans[0]^=i;
            else
                ans[1]^=i;
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] n=new int[]{1,2,5,2};
        singleNumbers(n);
    }
}
