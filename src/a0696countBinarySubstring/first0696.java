package a0696countBinarySubstring;

public class first0696 {
    public static void main(String[] args) {
        String s="00110";
        System.out.println(new Solution().countBinarySubstrings(s));
    }
}
class Solution {
    public int countBinarySubstrings(String s) {
        int ptr = 0, n = s.length(), last = 0, ans = 0;
        while (ptr < n) {
            char c = s.charAt(ptr);
            int count = 0;
            while (ptr < n && s.charAt(ptr) == c) {
                ++ptr;
                ++count;
            }
            ans += Math.min(count, last);
            last = count;
        }
        return ans;
    }
}