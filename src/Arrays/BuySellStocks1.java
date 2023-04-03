package Arrays;

public class BuySellStocks1 {

    //Bruteforce- use auxiliary array (find max selling price), sub with main array and return max value

    public static int maxProfit(int[] a){
        int min_so_far=Integer.MAX_VALUE;
        int maxProfit=0;
        //loop
        for (int i=0;i<a.length;i++){
            //find the min value to buy
           min_so_far=Math.min(min_so_far,a[i]);

            //calculate profit
            int temp=a[i]-min_so_far;

            //store the max profit
            maxProfit=Math.max(maxProfit,temp);

        }
        return maxProfit;

    }

    public static void main(String[] args) {
        int[] prices={7,1,5,3,6,4};
        System.out.println("profit :"+maxProfit(prices));

    }
}
