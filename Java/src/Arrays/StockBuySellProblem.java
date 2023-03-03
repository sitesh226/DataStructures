package Arrays;

/*
Problem Statement: You are given an array of prices where prices[i] is the price of a given stock on an ith day.

You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock.
Return the maximum profit you can achieve from this transaction.
 If you cannot achieve any profit, return 0.
 */
public class StockBuySellProblem {

    public static int maxProfit(int[] arr){
        int maxProfit=0;
        int minPrice=Integer.MAX_VALUE;

        for (int i=0;i< arr.length;i++){
            minPrice= Math.min(minPrice,arr[i]);
            maxProfit=Math.max(maxProfit,arr[i]-minPrice);
        }

        return maxProfit;
    }

    public static void main(String[] args) {
        int arr[] = {7,1,5,3,6,4};

        int maxPro = maxProfit(arr);
        System.out.println("Max profit is: " + maxPro);


    }

}
