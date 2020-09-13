package a0005longestPail;

public class second0005 {
    /**
     * 最长回文子串的中心扩展算法
     * 对于一个长度n的string，共有2n+1个可能的中心（字符上，字符间）
     * 对每个位置的字符，分别选择字符上和字符间进行扩展（复杂度O(n)）
     * 对于每个中心，同时往两边扩展，得到最长的回文子串长度（复杂度O(n)）
     * 如果长度比当前最大值长，则根据长度和i更新start和end
     * @param s
     * @return
     */
    public static String longestPalindrome(String s) {
        if (s==null||s.length()<1)
            return "";
        int start=0,end=0;
        for (int i=0;i<s.length();i++){
            int len1=extendAroundCenter(s,i,i);
            int len2=extendAroundCenter(s,i,i+1);
            int len=Math.max(len1,len2);
            if (len>end-start){
                start=i-(len-1)/2;
                end=i+len/2;
            }
        }
        return s.substring(start,end+1);
    }
    private static int extendAroundCenter(String s,int start,int end){
        int L=start,R=end;
        while (L>=0&&R<s.length()&&s.charAt(L)==s.charAt(R)){
            L--;
            R++;
        }
        return R-L-1;
    }

    public static void main(String[] args) {
        String s="";
        System.out.println(longestPalindrome(s));
//        System.out.println("".length());
    }
}
