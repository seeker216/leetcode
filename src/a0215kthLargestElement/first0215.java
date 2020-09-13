package a0215kthLargestElement;

import java.util.Arrays;
import java.util.Collections;

public class first0215 {
}
class Solution {
    public int findKthLargest(int[] nums, int k) {
        Integer[] a=Arrays.stream(nums).boxed().toArray(Integer[]::new);
        Arrays.sort(a,Collections.reverseOrder());
        return a[k-1];
    }
}