package a0322coinChange;

import java.util.Arrays;

public class first0322 {
    /**
     * 不对，需要调节硬币比例
     * @param coins
     * @param amount
     * @return
     */
    public static int coinChange(int[] coins, int amount) {
        int ans=0;
        if (amount<0||coins.length<1)
            return -1;
        int ptr=coins.length-1;
        Arrays.sort(coins);
        while (ptr>=0){
            ans+=(amount/coins[ptr]);
            amount%=coins[ptr];
            ptr--;
        }
        return amount==0?ans:-1;
    }

    public static void main(String[] args) {
        int[] coins=new int[]{186,419,83,408};
        int amount=6249;
        System.out.println(coinChange(coins,amount));
    }
}
