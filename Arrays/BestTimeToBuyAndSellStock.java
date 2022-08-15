package Arrays;

public class BestTimeToBuyAndSellStock {
    public static void main(String[] args) {
        // Integer[] prices = {7,1,5,3,6,4};
        Integer[] prices = {2,4,1};
        Integer minSoFar = Integer.MAX_VALUE;
        Integer maxProfit = Integer.MIN_VALUE;
        for(Integer i = 0; i < prices.length;i++){
            if(prices[i] < minSoFar){
                minSoFar = prices[i];
            }
            if(prices[i] - minSoFar >= maxProfit){
                maxProfit = prices[i] - minSoFar;
            }
        }
        System.out.println("Max Profit is "+maxProfit);
    }
}
