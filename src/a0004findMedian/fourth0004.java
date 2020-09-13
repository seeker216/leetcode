package a0004findMedian;

public class fourth0004 {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length, n = nums2.length;
        if (m > n) {
            int[] temp = nums1;
            nums1 = nums2;
            nums2 = temp;
            int tmp = m;
            m = n;
            n = tmp;
        }
        int iMin=0,iMax=m,halfLen=(m+n+1)/2;
        while (iMin<iMax){
            int i=(iMax+iMin)/2;
            int j=halfLen-i;
            if (i>iMin&&nums1[i-1]>nums2[j]){
                iMax=i-1;
            }else if (i<iMax&&nums1[i]<nums2[j-1]){
                iMin=i+1;
            }else {
                int leftMax=0;
                if (i==0){
                    leftMax=nums2[j-1];
                }else if (j==0){
                    leftMax=nums1[i-1];
                }else {
                    leftMax=Math.max(nums1[i-1],nums2[j-1]);
                }
                if ((m+n)%2==1)
                    return leftMax;
                int rightMin=0;
                if (i==m){
                    rightMin=nums2[j];
                }else if (j==n){
                    rightMin=nums1[i];
                }else {
                    rightMin= Math.min(nums1[i],nums2[j]);
                }
                return (leftMax+rightMin)/2.0;
            }
        }
        return 0;
    }
}
