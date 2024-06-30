/*
 * You are given an array prices where prices[i] is the price of a given stock on the ith day.
You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock.
Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.

Example 1:

Input: prices = [7,1,5,3,6,4]
Output: 5
Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5.
Note that buying on day 2 and selling on day 1 is not allowed because you must buy before you sell.
Example 2:

Input: prices = [7,6,4,3,1]
Output: 0
Explanation: In this case, no transactions are done and the max profit = 0.

 */

package arrays;
import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;


public class findProfit {
    
    static ArrayList<Integer> findStockPrices(int arr[],int n)
    {
        ArrayList<Integer> ans = new ArrayList<Integer>();
        int least_price = arr[0], least_index = 0, max_price ,max_index=0;
        for(int i = 0; i < n; i++)
        {
            if (arr[i] < least_price)
            {
                least_price = arr[i];
                least_index = i;
            }
        }
        if(least_index == n-1)
        {
            return ans;
        }
        else
        {
            max_price = arr[least_index];
            for(int i = least_index + 1; i < n; i++)
            {
                if(arr[i] > max_price)
                {
                    max_price = arr[i];
                    max_index = i;
                }
            }
            ans.add(least_index+1);
            ans.add(least_price);
            ans.add(max_index+1);
            ans.add(max_price);
        }
        return ans;
    }

    public static void main(String[] args) {
        
        Scanner scr = new Scanner(System.in);
        ArrayList<Integer> ans = new ArrayList<Integer>();
        int n;
        int[] arr;
        System.out.println("Enter number of elements : ");
        n = scr.nextInt();
        arr = new int[n];
        System.out.println("Enter prices one by one : ");
        for(int i = 0; i<n; i++)
        {
            arr[i] = scr.nextInt();
        }
        ans = findStockPrices(arr, n);
        if (ans.isEmpty())
        {
            System.out.println("0");
        }
        else
        {
            System.out.println("Buy at Day "+ans.get(0)+" at price : "+ans.get(1));
            System.out.println("Sell at Day "+ans.get(2)+" at price : "+ans.get(3));
        }

    }
}

/*
 * Output :
 * Enter number of elements : 
    6
    Enter prices one by one : 
    4 3 1 5 6 2
    Buy at Day 3 at price : 1
    Sell at Day 5 at price : 6
 */
