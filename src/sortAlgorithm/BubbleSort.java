package sortAlgorithm;

public class BubbleSort {
    public static void main(String[] args) {
        int[] nums=new int[]{1,2,3,4,5};
        myBubbleSort1(nums.clone());
        myBubbleSort2(nums.clone());
        myBubbleSort3(nums.clone());
    }

    public static void myBubbleSort1(int[] nums){
        int n=nums.length;
        int cnt=0;
        for (int i=0;i<n;i++){
            for (int j=0;j<n-1;j++){
                cnt++;
                if (nums[j]>nums[j+1]){
                    int tmp=nums[j];
                    nums[j]=nums[j+1];
                    nums[j+1]=tmp;
                }
            }
//            n--;
        }
        System.out.println(cnt);
    }

    public static void myBubbleSort2(int[] nums){
        int n=nums.length;
        int cnt=0;
        for (int i=0;i<n;i++) {
            for (int j=0;j<n-1-i;j++){
                cnt++;
                if (nums[j]>nums[j+1]){
                    int tmp=nums[j];
                    nums[j]=nums[j+1];
                    nums[j+1]=tmp;
                }
            }
        }
        System.out.println(cnt);
    }

    public static void myBubbleSort3(int[] nums){
        boolean flag=true;
        int n=nums.length;
        int i=0;
        while (flag){
            flag=false;
            for (int j=0;j<n-1-i;j++){
                if (nums[j]>nums[j+1]){
                    flag=true;
                    int tmp=nums[j];
                    nums[j]=nums[j+1];
                    nums[j+1]=tmp;
                }
            }
            i++;
        }
    }
}
