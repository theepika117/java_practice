/*
 * Write a program to print all Permutations of a given string.
Given a string s, the task is to print all the possible permutations of the given string.
 */

package strings;
import java.io.*;
import java.util.Scanner;


public class permutations {

    static void permutations(String str1, String str2)
    {
        if(str1.length() == 0)
        {
            System.err.print(str2+" ");
            return;
        }
        for(int i = 0; i < str1.length(); i++)
        {
            char ch = str1.charAt(i);
            String temp = str1.substring(0,i) + str1.substring(i+1);
            permutations(temp,str2+ch);
        }
    }

    public static void main(String[] args) {
        
        Scanner scr = new Scanner(System.in);
        String str1 = "", str2 = "";
        System.out.println("Enter a string : ");
        str1 = scr.nextLine();
        permutations(str1, str2);
    }
    
}



/*
 * output
 * Enter a string : 
   abcd
   abcd abdc acbd acdb adbc adcb bacd badc bcad bcda bdac bdca cabd cadb cbad cbda cdab cdba dabc dacb dbac dbca dcab dcba 
 */