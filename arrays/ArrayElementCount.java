/*
 * Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.

    Example 1:

    Input: nums = [1,2,3,1]
    Output: true
    Example 2:

    Input: nums = [1,2,3,4]
    Output: false
    Example 3:

    Input: nums = [1,1,1,3,3,4,3,2,4,2]
    Output: true
 */

package arrays;
import java.util.Scanner;

public class ArrayElementCount {

    static boolean IdentifyRepetition(int[] arr)
    {
        for(int i = 0; i < arr.length; i++)
        {
            int num = arr[i];
            for(int j = i+1 ; j < arr.length; j++)
            {
                if(arr[j] == num)
                {
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        
        Scanner scr = new Scanner(System.in);
        int n;
        int[] arr;
        System.out.println("Enter the number of elements : ");
        n = scr.nextInt();
        arr = new int[n];
        System.out.println("Enter the elements one by one : ");
        for(int i = 0; i < n; i++)
        {
            arr[i] = scr.nextInt();
        }
        System.out.println(IdentifyRepetition(arr));
    }
    
}




/*
 * Output :
 * Enter the number of elements : 
    5
    Enter the elements one by one : 
    1 3 5 6 4
    false

    Enter the number of elements : 
    6
    Enter the elements one by one : 
    1 1 2 3 4 5 
    true
 */
