/*
 * Given an integer array nums, return an array answer such that answer[i] is equal to the product of all the elements of nums except nums[i].


Example 1:

Input: nums = [1,2,3,4]
Output: [24,12,8,6]
Example 2:

Input: nums = [-1,1,0,-3,3]
Output: [0,0,9,0,0]
 */

package arrays;
import java.io.*;
import java.util.Scanner;

public class productOfOtherElements {

    static int[] findProduct(int[] arr, int n)
    {
        int[] ans = new int[n];
        int temp ;
        for(int i = 0; i < n; i++)
        {
            temp = 1;
            for(int j = 0; j< n; j++)
            {
                if (j != i)
                {
                    temp *= arr[j];
                }
            }
            ans[i] = temp;

        }
        return ans;
    } 

    public static void main(String[] args) {
        
        Scanner scr = new Scanner(System.in);
        int n;
        int[] arr;
        System.out.println("Enter number of elements : ");
        n = scr.nextInt();
        arr = new int[n];
        System.out.println("Enter array elements one by one : ");
        for(int i = 0; i < n; i++)
        {
            arr[i] = scr.nextInt();
        }
        int[] ans = new int[n];
        ans = findProduct(arr, n);
        for( int i = 0; i < n ; i++)
        {
            System.out.print(ans[i]+" ");
        }
    }
    
}


/*
 * Output :
 * Enter number of elements : 
6
Enter array elements one by one : 
2 3 1 3 4 10
360 240 720 240 180 72 
 */