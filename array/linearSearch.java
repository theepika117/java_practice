/*
 * Write a program in Java for Linear Search.
Linear search, also called sequential search, is a simple algorithm that is used for finding a specific item within a list. 
Each element of the list is sequentially searched until a match is found, or until the entire list is searched.
Example: Given an array scaler[] with n elements, write a function to locate an element x within the array scaler[].
 */
package array;
import java.io.*;
import java.util.Scanner;

public class linearSearch {

    static int linearSearch (int[] arr, int element, int n)
    {
        for (int num : arr)
        {
            if (num == element)
            {
                return 1;
            }

        }
        return -1;
    }


    public static void main(String[] args) {
        
        Scanner scr = new Scanner(System.in);
        int[] arr;
        int n,element,ans;
        System.out.println("Enter the number of elements in an array : ");
        n = scr.nextInt();
        arr = new int[n];
        System.out.println("Enter the elements one by one :");
        for(int i = 0; i<n; i++)
        {
            arr[i] = scr.nextInt();
        }
        System.out.println("Enter the element to search : ");
        element = scr.nextInt();
        ans = linearSearch(arr, element, n);
        if (ans == 1)
        {
            System.out.println("Element found");
        }
        else
        {
            System.out.println("Element not found");
        }


    }
    
}
