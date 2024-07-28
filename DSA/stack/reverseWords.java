/*
 * Given string str, we need to print the reverse of individual words.

    Example:

    Input : Hello World

    Output : olleH dlroW
 */


package DSA.stack;

import java.util.Scanner;

public class reverseWords {

    public static void main(String[] args) {
        StringStack stack = new StringStack();
        reversingString r = new reversingString();
        Scanner scr = new Scanner(System.in);
        String exp, str;
        System.out.println("Enter a string : ");
        str = scr.nextLine();
        exp = "\\s";
        String[] strList = str.split(exp);
        for(String temp : strList)
        {
            for(int i = 0; i  < temp.length(); i++)
            {
                stack.push(Character.toString(temp.charAt(i)));
            }
            System.out.print(r.reverse(stack)+" ");
        }
       
    }
    
}


/*
 * output
 * Enter a string : 
    Hi hello how are you
    iH olleh woh era uoy 
 */