/*
A

A       B

A       B       C

A       B       C       D
 */

package alphabetPattern;

import java.util.Scanner;

public class rightAngledTriangle {

    public static void main(String[] args) {
        
        int n,i,j;
        char ch;
        Scanner scr = new Scanner(System.in);
        System.out.println("Enter a number : ");
        n = scr.nextInt();
        for(i = 1; i <= n; i++)
        {
            ch = 'A';
            for(j = 1; j <= i; j++)
            {
                System.out.print(ch+"\t");
                ch++;
            }
            System.out.println();
            System.out.println();
        }
    }

    
}
