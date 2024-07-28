package DSA.stack;

import java.util.Scanner;

public class reversingString {
    
    public String reverse(StringStack stack)
    {
       String rev = "";
       int length = stack.size();
       for(int i = 0; i < length ; i++)
       {
        String str = stack.pop();
        rev += str;
       }
       return rev;

    }


    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        StringStack stack = new StringStack();
        reversingString r = new reversingString();
        System.out.println("Enter a string : ");
        String str = scr.next();
        for(int i = 0; i < str.length();i++)
        {
            stack.push(Character.toString(str.charAt(i)));
        }
        System.out.println(r.reverse(stack));
    }
}




/*
 * output
 * Enter a string : 
    theepika
    akipeeht
 */