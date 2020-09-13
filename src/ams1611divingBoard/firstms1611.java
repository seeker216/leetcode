package ams1611divingBoard;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class firstms1611 {
    public static void main(String[] args) {
        new Solution().divingBoard(1,2,3);
    }
}
class Solution {
    public int[] divingBoard(int shorter, int longer, int k) {
        Set<Integer> set=new TreeSet<>();
        for (int i=0;i<=k;i++){
            int tmp=i*longer+(k-i)*shorter;
//            System.out.println(tmp);
            if (tmp>0)
                set.add(tmp);
        }
//        Object[] obj=set.toArray();

        return Arrays.stream((Integer[])set.toArray(new Integer[0])).mapToInt(Integer::valueOf).toArray();
    }
}