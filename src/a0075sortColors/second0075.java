package a0075sortColors;

public class second0075 {
    public static void sortColors(int[] nums) {
        int n=nums.length;
        int l=0,r=n-1,curr=0;
        while (curr<=r){
            if (nums[curr]==0) {
                swap(nums,l,curr);
                l++;
                curr++;
            }else if (nums[curr]==2){
                swap(nums,r,curr);
                r--;
//                curr++;
            }else {
                curr++;
            }

        }
    }

    private static void swap(int[] nums, int n1, int n2) {
        int tmp=nums[n1];
        nums[n1]=nums[n2];
        nums[n2]=tmp;
    }

    public static void main(String[] args) {
        int[] a=new int[]{2,0,1};
        sortColors(a);
    }
}
