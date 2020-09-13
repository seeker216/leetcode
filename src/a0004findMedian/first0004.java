package a0004findMedian;

public class first0004 {
    /**
     * 对于两个数组A和B，各自把它们分成两部分，A长度m，B长度n，A分割点i,B分割点j，
     * 则A[0]...A[i-1]和B[0]...B[j-1]构成左半部分，A[i]...A[m-1]和B[j]...B[n-1]构成右半部分。
     * 理想情况：
     * 若左半部分和右半部分一样多：i+j=m-i+n-j  j=(m+n)/2-i
     * 若左半部分比右半部分多一个：i+j+1=m-i+n-j  j=(m+n+1)/2-i  由于是int运算，可以统一为j=(m+n+1)/2-i
     * i的范围是[0,m]，以二分的方式找到恰好的划分，然后分别讨论i=0,i=m,j=0,j=n的特殊情况
     * @param nums1
     * @param nums2
     * @return
     */
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m=nums1.length,n=nums2.length;
        /*
        确保m<=n，如果m>n则交换两个数组
        原因是若m>n则j有可能出现负数
         */
        if (m>n){
            int[] temp=nums1;
            nums1=nums2;
            nums2=temp;
            int tmp=m;
            m=n;
            n=tmp;
        }
        /*
        对i进行二分查找，范围从0到m
         */
        int iMin=0,iMax=m,half=(m+n+1)/2;
        while (iMin<=iMax){
            int i=(iMin+iMax)/2;
            int j=half-i;
            /*
            这时说明i偏小，且i越大j越小
             */
            if (i<iMax&&nums1[i]<nums2[j-1])
                iMin=i+1;
            /*
            i偏大
             */
            else if (i>iMin&&nums1[i-1]>nums2[j])
                iMax=i-1;
            /*
            i,j都正好
             */
            else {
                int maxLeft=0;
                if (i==0){
                    maxLeft=nums2[j-1];
                }else if (j==0){
                    maxLeft=nums1[i-1];
                }else
                    maxLeft=Math.max(nums1[i-1],nums2[j-1]);
                if ((m+n)%2==1)
                    return maxLeft;
                int minRight=0;
                if (i==m){
                    minRight=nums2[j];
                }else if (j==n){
                    minRight=nums1[i];
                }else
                    minRight= Math.min(nums1[i],nums2[j]);
                return (maxLeft+minRight)/2.0;
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        findMedianSortedArrays(new int[]{1,3},new int[]{2});
    }
}
