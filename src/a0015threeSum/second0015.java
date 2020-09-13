package a0015threeSum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class second0015 {
    /**
     * 自己理解的双指针算法
     * @param nums
     * @return
     */
    public static List<List<Integer>> threeSum(int[] nums) {
        List<Integer> numbers= Arrays.stream(nums).boxed().collect(Collectors.toList());
        Collections.sort(numbers);
        List<List<Integer>> res=new ArrayList<>();
        int k=0;
        while (k<numbers.size()&&numbers.size()>2&&numbers.get(k)<=0){
            int i=k+1,j=numbers.size()-1;
            while (i<j){
                int s=numbers.get(k)+numbers.get(i)+numbers.get(j);
                if (s==0){
                    List<Integer> tmp=new ArrayList<>();
                    tmp.add(numbers.get(k));
                    tmp.add(numbers.get(i));
                    tmp.add(numbers.get(j));
                    res.add(tmp);
                    do {
                        j--;
                    }while (j>=0&&j+1<numbers.size()&&numbers.get(j+1).equals(numbers.get(j)));
                    do {
                        i++;
                    }while (i<numbers.size()&&i-1>=0&&numbers.get(i-1).equals(numbers.get(i)));
                }else if (s>0)
                    do {
                        j--;
                    }while (j>=0&&j+1<numbers.size()&&numbers.get(j+1).equals(numbers.get(j)));
                else if (s<0)
                    do {
                        i++;
                    }while (i<numbers.size()&&i-1>=0&&numbers.get(i-1).equals(numbers.get(i)));
            }
            do {
                k++;
            }while (k<numbers.size()&&numbers.get(k).equals(numbers.get(k-1)));
        }
        return res;
    }
    public static void main(String[] args) {
        int[] nums={-2, 0, 1, 1, 2};
        System.out.println(threeSum(nums));
    }
}
