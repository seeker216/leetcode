package a0055jumpGame;

public class first0055 {
    /**
     * 跳跃游戏，逐个搜索
     * @param nums
     * @return
     */
    public static boolean canJump(int[] nums) {
        int n=nums.length;
        boolean[] flag=new boolean[n];
        flag[0]=true;
        for (int i=0;i<n-1;i++){
            if (!flag[i])
                break;
            for (int j=0;j<=nums[i]&&j+i<n;j++){
                flag[j+i]=true;
            }
        }
        return flag[n-1];
    }

    public static void main(String[] args) {
        int[] tmp={0,2,3};
        System.out.println(canJump(tmp));
    }
}
