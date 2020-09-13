package a0121maxProfit;

public class first0121 {
    /**
     * 自己想的动态规划
     * 利润是由当前价格和此前的最低价格决定的，所以要维护一个最低价格min
     * dp数组里维护每一步的最大利润，即前一天的最大利润dp[i-1]和今天的最大利润prics[i]-min的最大值
     * @param prices
     * @return
     */
    public int maxProfit(int[] prices) {
        if (prices.length<1)
            return 0;
        int[] dp=new int[prices.length];
        dp[0]=0;
        int min=prices[0];
        for (int i=1;i< prices.length;i++){
            min=Math.min(min,prices[i]);
            dp[i]=Math.max(dp[i-1],prices[i]-min);
        }
        return dp[prices.length-1];
    }
}
