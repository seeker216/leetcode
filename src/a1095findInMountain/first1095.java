package a1095findInMountain;

public class first1095 {
    public int findInMountainArray(int target, MountainArray mountainArr) {
        int len=mountainArr.length();
        int peakIndex=findPeak(mountainArr,0,len-1);

        if (mountainArr.get(peakIndex)==target)
            return peakIndex;
        int left=findInLeft(mountainArr,0,peakIndex-1,target);
        if (left!=-1)
            return left;
        return findInRight(mountainArr,peakIndex+1,len-1,target);
    }

    private int findInRight(MountainArray mountainArr, int left, int right, int target) {
        while (left<right) {
            int mid = left + (right - left + 1) / 2;
            if (mountainArr.get(mid) < target) {
                right=mid-1;
            }else {
                left=mid;
            }
        }
        if (mountainArr.get(left)==target)
            return left;
        return -1;
    }

    private int findInLeft(MountainArray mountainArr, int left, int right, int target) {
        while (left<right) {
            int mid = left + (right - left) / 2;
            if (mountainArr.get(mid) < target) {
                left=mid+1;
            }else {
                right=mid;
            }
        }
        if (mountainArr.get(left)==target)
            return left;
        return -1;
    }

    private int findPeak(MountainArray mountainArr, int left, int right) {
        while (left<right) {
            int mid = left + (right - left) / 2;
            if (mountainArr.get(mid) < mountainArr.get(mid + 1)) {
                left=mid+1;
            }else {
                right=mid;
            }
        }
        return left;
    }
}
