/*
 * Write a Java program to reverse a given string without using any built-in functions or libraries.
 */

 import java.io.*;
 import java.util.Scanner;

public class reverseString {
    
    public static void main(String[] args) {

        Scanner scr = new Scanner(System.in);
        int i,len ;
        String str;
        char temp;
        System.out.println("Enter a string : ");
        str = scr.nextLine();
        len = str.length();
        char[] rev = str.toCharArray();             // Java does not treat string as character array, it is by default string datatype and hence we convert it to a string array
        for(i = 0; i < len/2; i++)
        {
            temp = rev[i];
            rev[i] = rev[len-i-1];
            rev[len - i - 1] = temp;

        }

        System.out.println(rev);

        
    }
}
