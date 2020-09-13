package a0003lenofLongest;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class first0003 {
    /**
     * 滑动窗口法，start和i确定窗口大小，扫描一遍，对于第i个字符，若map中已有，则把start更新为
     * start和该字符后面的字符的索引的最大值；否则更新最大长度res，map中存的是‘字符-下一位索引位’
     * 的键值对，目的是当出现重复时，快速定位到下一位。
     * @param s
     * @return
     */
    public static int lengthOfLongestSubstring(String s) {
        int res=0,n=s.length();
        Map<Character,Integer> map=new HashMap<>();
        int start=0;
        for (int i=0;i<n;i++){
            if (map.containsKey(s.charAt(i)))
                start=Math.max(start,map.get(s.charAt(i)));
            res=Math.max(res,i-start+1);
            map.put(s.charAt(i),i+1);
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("abba"));
    }
}
