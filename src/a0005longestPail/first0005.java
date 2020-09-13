package a0005longestPail;

public class first0005 {
    /**
     * 暴力法
     * @param s
     * @return
     */
    public static String longestPalindrome(String s) {
        String res="";
        for (int i=0;i<s.length();i++){
            for (int j=i+1;j<=s.length();j++){
                if (isPalindrome(s.substring(i,j))&&s.substring(i,j).length()>res.length())
                    res=s.substring(i,j);
            }
        }
        return res;
    }

    private static boolean isPalindrome(String s){
        if (s.length()==1)
            return true;
        else if (s.length()==2&&s.charAt(0)==s.charAt(1))
            return true;
        else if  (s.length()==2&&s.charAt(0)!=s.charAt(1))
                return false;
        else
            return s.charAt(0)==s.charAt(s.length()-1)&&isPalindrome(s.substring(1,s.length()-1));

    }

    public static void main(String[] args) {
        String s="babad";
        System.out.println(longestPalindrome(s));
    }
}
