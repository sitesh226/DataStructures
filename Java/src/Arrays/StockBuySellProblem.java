package Arrays;

/*
Problem Statement: You are given an array of prices where prices[i] is the price of a given stock on an ith day.

You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock.
Return the maximum profit you can achieve from this transaction.
 If you cannot achieve any profit, return 0.
 */
public class StockBuySellProblem {

    public static int maxProfitWithSingleBuySell(int[] arr){
        int maxProfit=0;
        int minPrice=Integer.MAX_VALUE;

        for (int i=0;i< arr.length;i++){
            minPrice= Math.min(minPrice,arr[i]);
            maxProfit=Math.max(maxProfit,arr[i]-minPrice);
        }

        return maxProfit;
    }


    public static  int maxProfitWithAnyNumberOfBuySells(int[] arr){
        int maxProfit=0;

        for (int i=1;i<arr.length;i++){
            if(arr[i]>arr[i-1]){
                maxProfit=maxProfit+arr[i]-arr[i-1];
            }
        }

        return maxProfit;
    }

    public static void main(String[] args) {
       // int arr[] = {1,7,5,3,6,4};
        int arr[] = { 100, 180, 260, 310, 40, 535, 695 };

        int maxPro = maxProfitWithSingleBuySell(arr);
        System.out.println("Max profit with single buy sell is: " + maxPro);

        int maxPro2 = maxProfitWithAnyNumberOfBuySells(arr);
        System.out.println("Max profit with any number of buy sell is: " + maxPro2);


    }

}
