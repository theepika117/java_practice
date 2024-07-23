/*
 * Given an array containing n distinct numbers taken from 0, 1, 2, …, n, find the one that is missing from the array.
To find the missing number in an array containing distinct numbers taken from 0 to n, you can utilize the concept of arithmetic progression and Gauss’s formula.
 
Gauss's formula = sum of n natural numbers = n(n + 1) / 2
if a number is missing, we can simply find it out by finding the difference between the actual sum and the expected sum
*/

import java.io.*;
import java.util.Scanner;

public class findingMissingNumber {

    public static void main(String[] args) {
        
        Scanner scr = new Scanner (System.in);
        int n,expected_sum,actual_sum = 0,missing_number,i;
        System.out.println("Enter number of elements : ");
        n = scr.nextInt();
        int[] num = new int[n] ;
        System.out.println("Enter the numbers : ");
        for(i = 0; i < n ; i++)
        {
            num[i] = scr.nextInt();
        }
        
        expected_sum = ( n * (n + 1) ) / 2;
        for(i = 0; i < n; i++)
        {
            actual_sum += num[i];
        }
        missing_number = expected_sum - actual_sum ;
        System.out.println(missing_number);




    }
    
}






/*
 * OUTPUT
 * Enter number of elements : 
    3
    Enter the numbers : 
    3 0 1
2
 */