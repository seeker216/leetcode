package a0004findMedian;

public class fifth0004 {
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m=nums1.length,n=nums2.length;
        if (m>n){
            int tmp=m;
            m=n;
            n=tmp;
            int[] tmpa=nums1;
            nums1=nums2;
            nums2=tmpa;
        }
        int iMin=0,iMax=m;
        int halfLen=(m+n+1)/2;
        while (iMin<=iMax){
            int i=(iMin+iMax)/2;
            int j=halfLen-i;
            if (i>0&&nums1[i-1]>nums2[j]){
                iMax=i-1;
            }else if (i<iMax&&nums1[i]<nums2[j-1]){
                iMin=i+1;
            }else {
                int leftMax=0;
                if (i==0){
                    leftMax=nums2[j-1];
                }else if(j==0){
                    leftMax=nums1[i-1];
                }else {
                    leftMax=Math.max(nums1[i-1],nums2[j-1]);
                }
                if (((m+n)&1)==1)
                    return leftMax;
                int rightMin=0;
                if (i==m){
                    rightMin=nums2[j];
                }else if (j==n){
                    rightMin=nums1[i];
                }else {
                    rightMin=Math.min(nums1[i],nums2[j]);
                }
                return (leftMax+rightMin)/2.0;
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        int[] a=new int[]{1,3};
        int[] b=new int[]{2};
        System.out.println(findMedianSortedArrays(a,b));
    }
}
