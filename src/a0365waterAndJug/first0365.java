package a0365waterAndJug;

public class first0365 {
    public boolean canMeasureWater(int x, int y, int z) {
        if (x+y<z)
            return false;
        if (x==0||y==0)
            return z==0||x+y==z;
        return z%gcd(x,y)==0;
    }

    private static int gcd(int x, int y) {
        while (x%y!=0){
            int tmp=y;
            y=x%y;
            x=tmp;
        }
        return y;
    }

    public static void main(String[] args) {
        System.out.println(gcd(3,5));
    }
}
