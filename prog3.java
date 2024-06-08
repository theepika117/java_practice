// Write a program that prompts the user to input a number. The program should then output
// the number and a message saying whether the number is positive, negative, or zero.

import java.util.Scanner;

public class prog3 {
    public static void main(String args[])
    {
        Scanner scr = new Scanner(System.in);
        int num;
        System.out.println("Enter a number : ");
        num = scr.nextInt();
        if(num<0)
        {
        System.out.println("Enter a positive integer");
        }
        else if (num == 0)
        {
            System.out.println("Zero is neither odd nor even");
        }
        else if (num % 2 == 0) 
        {
            System.out.println(num + " is even ");
        }
        else 
        {
            System.out.println(num + " is odd");
        }

    }
    
}


/*
Enter a number : 
11
11 is odd

Enter a number : 
14
14 is even 

 */
