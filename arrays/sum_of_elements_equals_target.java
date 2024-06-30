/*
 * Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

You can return the answer in any order.

Example 1:

Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
Example 2:

Input: nums = [3,2,4], target = 6
Output: [1,2]
Example 3:

Input: nums = [3,3], target = 6
Output: [0,1]
 */


package arrays;
import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;




class sum_of_elements_equals_target{

    static ArrayList<Integer> findSum (int[] arr, int n, int target)
    {
        ArrayList<Integer> ans = new ArrayList<Integer>() ;
        for (int i = 0; i < n; i++)
        {
            if (i >= target)
            {
                continue;
            }
            else
            {
                for(int j = i+1; j < n; j++)
                {
                    if(j > target )
                    {
                        continue;
                    }
                    else if((arr[i]+arr[j]) == target)
                    {
                        ans.add(i);
                        ans.add(j);
                    }
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {

        Scanner scr = new Scanner(System.in);
        int[] arr ;        
        int n,target;
        System.out.println("Enter number of elements : ");
        n = scr.nextInt();
        arr = new int[n];
        System.out.println("Enter the elements one by one : ");
        for(int i = 0; i < n;i++)
        {
            arr[i] = scr.nextInt();
        }
        System.out.println("Enter target : ");
        target = scr.nextInt();
        System.out.println(findSum(arr, n, target));

    }

}



/*
 * Output :
 * Enter number of elements : 
    6
    Enter the elements one by one : 
    1 7 2 5 4 3
    Enter target : 
    6 
    [0, 3, 2, 4]
 * 
 */