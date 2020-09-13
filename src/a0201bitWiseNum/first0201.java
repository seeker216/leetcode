package a0201bitWiseNum;

public class first0201 {
}
class Solution {
    public int rangeBitwiseAnd(int m, int n) {
        int shift=0;
        while (m!=n){
            m>>=1;
            n>>=1;
            shift++;
        }
        return m<<shift;
    }
}