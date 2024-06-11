/*
 * Given a Integer array A[] of n elements. Your task is to complete the function PalinArray. 
 * Which will return 1 if all the elements of the Array are palindrome otherwise it will return 0.
 * Input:
    5
    111 222 333 444 555

    Output:
    1

    Input:
    3
    121 131 20
 
    Output:
    0
 */


import java.io.*;
import java.util.Scanner;

public class isEveryNumPalindrome {

    public static int palinArray(int[] a, int n)
           {
                  //add code here.
                  boolean isPalindrome = false;
                  for (int num : a)
                  {
                      
                      String str = String.valueOf(num);
                      StringBuilder sb = new StringBuilder(str);
                      String rev = sb.reverse().toString();
                      if (rev.equals(str))
                      {
                          isPalindrome = true;
                      }
                      else
                      {
                          isPalindrome = false;
                          return 0;
                      }
                  }
                  
                  
                  return 1;
           }
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        int n, a[], ans;
        System.out.println();
        n = scr.nextInt();
        a = new int[n];
        for (int i = 0; i<n; i++)
        {
            a[i] = scr.nextInt();
        }
        ans = palinArray(a, n);
        System.out.println(ans);
    }
}


/* OUTPUT :
 * 2
12 11
0
 */