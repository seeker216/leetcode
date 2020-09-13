package a0121maxProfit;

public class second0121 {
    /**
     * 定义好minprice maxprofit，
     * 从0开始遍历一遍，如果当前价格比minprice小肯定不会更新maxprofit！
     * @param prices
     * @return
     */
    public int maxProfit(int prices[]) {
        int minprice = Integer.MAX_VALUE;
        int maxprofit = 0;
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < minprice)
                minprice = prices[i];
            else if (prices[i] - minprice > maxprofit)
                maxprofit = prices[i] - minprice;
        }
        return maxprofit;
    }
}
