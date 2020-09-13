package a0003lenofLongest;

import java.util.HashMap;
import java.util.Map;

public class second0003 {
    public static int lengthOfLongestSubstring(String s) {
        int res=0,start=0;
        Map<Character,Integer> map=new HashMap<>();
        for (int i=0;i<s.length();i++){
            if (map.containsKey(s.charAt(i))) {
                start = Math.max(start, map.get(s.charAt(i)));
            }
            map.put(s.charAt(i),i+1);
            res=Math.max(res,i-start+1);
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("abba"));
    }
}
