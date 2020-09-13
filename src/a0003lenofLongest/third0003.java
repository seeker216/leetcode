package a0003lenofLongest;

import java.util.HashMap;
import java.util.Map;

public class third0003 {
    public static int lengthOfLongestSubstring(String s) {
        int ans=0,n=s.length(),start=0;
        Map<Character,Integer> map=new HashMap<>();
        for (int i=0;i<n;i++){
            if (map.containsKey(s.charAt(i)))
                start= Math.max(start,map.get(s.charAt(i)));
            ans=Math.max(ans,i-start+1);
            map.put(s.charAt(i),i+1);
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("abcaaaf"));
    }
}
