package a0005longestPail;

public class third0005 {
    public static String longestPalindrome(String s) {
        int n=s.length();
        String ans="";
        for(int i=0;i<n;i++){
            int len1=extendFromCenter(s,i,i);
            int len2=extendFromCenter(s,i,i+1);
            int tmpLen=Math.max(len1,len2);
            ans=tmpLen>ans.length()?s.substring(i-(tmpLen-1)/2,tmpLen/2+i+1):ans;
        }
        return ans;
    }
    static int extendFromCenter(String s,int L,int R){
        int n=s.length();
        while(L>=0&&R<n){
            if(s.charAt(L)==s.charAt(R)){
                L--;
                R++;
            }else
                break;
        }
        return R-L-1;
    }

    public static void main(String[] args) {
        System.out.println(longestPalindrome("babad"));
    }
}
