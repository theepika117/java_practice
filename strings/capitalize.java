

package strings;
import java.io.*;
import java.util.Scanner;

public class capitalize {

    static String capitalize(String str)
    {
        String firstLetter = str.substring(0, 1).toUpperCase();
        String remainingString = str.substring(1);
        return firstLetter+remainingString;
    }

    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        String str ;
        String regex = "\s";
        System.out.println("Enter a String");
        str = scr.nextLine();
        String[] words = str.split(regex);
        for(String word : words)
        {
            System.out.print(capitalize(word)+" ");
        }
        
    }
    
}
/*
 * output:
 * Enter a String
hello theeps how are you how was your day
Hello Theeps How Are You How Was Your Day 
 */