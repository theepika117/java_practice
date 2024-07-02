/*
 * Given an integer array nums, find a subarray that has the largest product, and return the product.

    Example 1:

    Input: nums = [2,3,-2,4]
    Output: 6
    Explanation: [2,3] has the largest product 6.
    Example 2:

    Input: nums = [-2,0,-1]
    Output: 0
    Explanation: The result cannot be 2, because [-2,-1] is not a subarray.
 */

package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class productOfSubarray {
    
    static int ReturnLargestProduct(int arr[],int n)

    {
        List<int[]> subArrays = new ArrayList<int[]>(); 
        int product,maxProduct =0;
        ArrayList<Integer> sumOfSubArray = new ArrayList<Integer>();
        for(int i = n-1; i >= 0; i--)
        {
            for(int start = 0; start < n-1; start++)
            {
                int[] subArray = Arrays.copyOfRange(arr, start , (start + i));
                subArrays.add(subArray);
                product = 1;
                for(int num : subArray)
                {
                    product *= num;
                }
                sumOfSubArray.add(product);
            }
        } 
        maxProduct = sumOfSubArray.get(0);
        for(int i = 1; i < sumOfSubArray.size(); i++)
        {
            if(sumOfSubArray.get(i) > maxProduct)
            {
                maxProduct = sumOfSubArray.get(i);
            }
        }
        
        return maxProduct;
    }

    public static void main(String[] args) {
        
        Scanner scr = new Scanner(System.in);
        int n;
        int[] arr;
        System.out.println("Enter the number of elements : ");
        n = scr.nextInt();
        arr = new int[n];
        System.out.print("Enter the elements one by one : ");
        for( int i = 0; i < n; i++)
        {
            arr[i] = scr.nextInt();
        }
        if (n == 1)
        {
            System.out.println(arr[0]);
        }
        else
        {
            System.out.println(ReturnLargestProduct(arr, n));
        }
        
    }
}


/*
 * Output :
 * Enter the number of elements : 
    5
    Enter the elements one by one : 5 1 0 0 2
    5
 */
