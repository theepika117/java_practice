/*
 * Given an integer array nums, find the subarray with the largest sum, and return its sum.

Example 1:

Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
Output: 6
Explanation: The subarray [4,-1,2,1] has the largest sum 6.
Example 2:

Input: nums = [1]
Output: 1
Explanation: The subarray [1] has the largest sum 1.
Example 3:

Input: nums = [5,4,-1,7,8]
Output: 23
Explanation: The subarray [5,4,-1,7,8] has the largest sum 23.
 */


package arrays;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class SubArraySum {

    static int FindLargetSum(int arr[],int n)

    {
        List<int[]> subArrays = new ArrayList<int[]>(); 
        int sum,maxSum =0,index=0;
        ArrayList<Integer> sumOfSubArray = new ArrayList<Integer>();
        for(int i = n-1; i >= 0; i--)
        {
            for(int start = 0; start < n-1; start++)
            {
                int[] subArray = Arrays.copyOfRange(arr, start , (start + i));
                subArrays.add(subArray);
                sum = 0;
                for(int num : subArray)
                {
                    sum += num;
                }
                sumOfSubArray.add(sum);
            }
        } 
        maxSum = sumOfSubArray.get(0);
        for(int i = 1; i < sumOfSubArray.size(); i++)
        {
            if(sumOfSubArray.get(i) > maxSum)
            {
                maxSum = sumOfSubArray.get(i);
                index = i;
            }
        }
        
        return maxSum;
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
            System.out.println(FindLargetSum(arr, n));
        }
        
    }

}

/*
 * Output :
 * Enter the number of elements : 
    8
    Enter the elements one by one : -1 -2 -5 0 4 5 6 -1  
    15
 */