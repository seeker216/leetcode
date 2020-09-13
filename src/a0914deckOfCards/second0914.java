package a0914deckOfCards;

public class second0914 {
    public boolean hasGroupsSizeX(int[] deck) {
        int[] counter=new int[10000];
        for (int i:deck){
            counter[i]++;
        }
        int g=-1;
        for (int i:counter){
            if (i>0){
                if (g==-1){
                    g=i;
                }else {
                    g=gcd(g,i);
                }
            }
        }
        return g>=2;
    }

    public int gcd(int x, int y) {
        return x == 0 ? y : gcd(y%x, x);
    }
}
