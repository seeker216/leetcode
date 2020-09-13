package a1431mostCandyKid;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class first1431 {
}
class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max= Arrays.stream(candies).max().getAsInt();
        List<Boolean> ans=new ArrayList<>();
        for (int i:candies){
            if (i+extraCandies>=max)
                ans.add(true);
            else
                ans.add(false);
        }
        return ans;
    }
}