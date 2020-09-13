package a0466countRepetitions;

public class first0466 {
    /**
     * 暴力法
     * @param s1
     * @param n1
     * @param s2
     * @param n2
     * @return
     */
    public int getMaxRepetitions(String s1, int n1, String s2, int n2) {
        int ans=0;
        String ss1=new String(),ss2=new String();
        for (int i=0;i<n1;i++){
            ss1=ss1.concat(s1);
        }
        for (int i=0;i<n2;i++){
            ss2=ss2.concat(s2);
        }
        int j=0;
        for (int i=0;i<ss1.length();i++){
            if (ss1.charAt(i)==ss2.charAt(j)&&j==ss2.length()-1){
                ans++;
                j=0;
            }else if (ss1.charAt(i)==ss2.charAt(j)){
                j++;
            }
        }
        return ans;
    }
}
