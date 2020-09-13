package a0067addBinary;

public class first0067 {
    public static void main(String[] args) {
        System.out.println(new Solution().addBinary("11","1"));
    }
}
class Solution {
    public String addBinary(String a, String b) {
        String ans="";
        int l1=a.length(),l2=b.length();
        int i=l1-1,j=l2-1;
        int carry=0;
        while (i>=0||j>=0){
            int na=i>=0?a.charAt(i)-'0':0;
            int nb=j>=0?b.charAt(j)-'0':0;
            int tmp=na+nb+carry;
            carry=tmp/2;
            ans=String.valueOf(tmp%2).concat(ans);
            i--;
            j--;
        }
        if (carry>0){
            ans="1".concat(ans);
        }
        return ans;
    }
}
