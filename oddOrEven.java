// Write a program that asks the user to enter a number and displays whether entered number
// is an odd number or even number.

import java.util.Scanner;

class oddOrEven
{
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
            System.out.println("The number is even ");
        }
        else 
        {
            System.out.println("The number is odd");
        }
        

    }
}



/*
OUTPUT :

Enter a number :
11
The number is odd

Enter a number :
8
The number is even

Enter a number :
0
Zero is neither odd nor even

Enter a number : 
-3
Enter a positive integer


 */