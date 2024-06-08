// Write a program that asks the user to enter a numbers in three variables and then displays
// the largest number.

import java.util.Scanner;

public class largestOf3 {

    public static void main(String args[])
    {
        Scanner scr = new Scanner(System.in);
        int num1,num2,num3;
        System.out.println("Enter 3 integers ");
        num1 = scr.nextInt();
        num2 = scr.nextInt();
        num3 = scr.nextInt();
        
        if (num1 == num2 || num2 == num3 || num1 == num3)
        {
            System.out.println("Two of given three numbers are same ");
        }

        else if (num1 > num2 && num1 > num3)
        {
            System.out.println(num1 + " is greatest of all");
        }

        else if(num2 > num3)
        {
            System.out.println(num2 + " is greatest of all");
        }

        else
        {
            System.out.println(num3 + " is greatest of all");
        }
    }
    
}




/*
OUTPUT : 

Enter 3 integers 
66
88
2
88 is greatest of all

4
5
5
Two of given three numbers are same
 */