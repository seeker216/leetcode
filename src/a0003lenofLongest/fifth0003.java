package a0003lenofLongest;

import java.util.HashMap;
import java.util.Map;

public class fifth0003 {
    public static int lengthOfLongestSubstring(String s) {
        Map<Character,Integer> map=new HashMap<>();
        int max=0;
        int start=0;
        for (int i=0;i<s.length();i++){
            if (map.containsKey(s.charAt(i))){
                start=Math.max(start,map.get(s.charAt(i)));
            }
            max=Math.max(max,i-start+1);
            map.put(s.charAt(i),i+1);
        }
        return max;
    }

    public static void main(String[] args) {
        String s="abcabcbb";
        System.out.println(lengthOfLongestSubstring(s));
    }
}
