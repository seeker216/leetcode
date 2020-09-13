package a1013partitionArrayTo3;

public class first1013 {
    /**
     * 双指针法
     * 首先计算累加和，如果不能整除3直接false。
     * 然后分别计算左边的累加和和右边的累加和，如果左边的累加和等于右边的累加和都等于sum/3且left+1<right（保证还有中间一部分）则返回true
     * 如果只有一侧满足，固定不动，另一侧继续移动
     * 如果两侧都不满足，只移动左侧就OK（不用考虑太复杂
     * @param A
     * @return
     */
    public static boolean canThreePartsEqualSum(int[] A) {
        int sum=0;
        int n=A.length;
        for (int i:A)
            sum+=i;
        if (sum%3!=0)
            return false;
        else {
            int left=0;
            int right=n-1;
            int leftSum=A[left],rightSum=A[right];
            while (left<right){
                if (leftSum==sum/3&&rightSum==sum/3&&left+1<right){
                    return true;
                }else if (leftSum==sum/3){
                    right--;
                    rightSum+=A[right];
                }else if (rightSum==sum/3){
                    left++;
                    leftSum+=A[left];
                }else {
                    left++;
                    leftSum+=A[left];
                }
            }
            return false;
        }
    }

    public static void main(String[] args) {
        int[] a=new int[]{1,-1,1,-1};
        System.out.println(canThreePartsEqualSum(a));
    }
}
