package Arrays;

public class BuySellStocks1 {

    public static int maxProfit(int[] prices){
        int min_so_far=Integer.MAX_VALUE;
        int profit=0;
        //loop
        for (int i=0;i<prices.length;i++){
            //find the min value to buy
            if (prices[i]<min_so_far){
                min_so_far=prices[i];
            }
            //calculate profit
            int temp=prices[i]-min_so_far;
            if (temp>profit){
                profit=temp;
            }
        }
        return profit;

    }

    public static void main(String[] args) {
        int[] prices={7,1,5,3,6,4};
        System.out.println("profit :"+maxProfit(prices));

    }
}
