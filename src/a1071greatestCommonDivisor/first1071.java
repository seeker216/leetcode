package a1071greatestCommonDivisor;

import java.util.Arrays;

public class first1071 {
    /**
     * 辗转相除法
     * @param str1
     * @param str2
     * @return
     */
    public static String gcdOfStrings(String str1, String str2) {
        String ans=new String();
        if (str1==null||str1.length()<1||str2==null||str2.length()<1)
            return "";
        int n1=str1.length(),n2=str2.length();
        if (n1<n2){
            String tmp=str1;
            str1=str2;
            str2=tmp;
            int tmpn=n1;
            n1=n2;
            n2=tmpn;
        }
        if (n1%n2==0){
            if (str1.substring(0,n2).equals(str2)&&str1.split(str2).length==0)
                ans = str2;
        }else{
            ans=gcdOfStrings(str2,str1.substring(n2));
        }
        return ans;
    }

    public static void main(String[] args) {
        String a="abcdef";
        String b="abc";
        System.out.println(gcdOfStrings(a,b));
    }
}
