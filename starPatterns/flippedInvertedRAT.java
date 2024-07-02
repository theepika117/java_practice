/*
*       *       *       *       *

        *       *       *       *

                *       *       *

                        *       *

                                *
 */

package starPatterns;

import java.util.Scanner;

public class flippedInvertedRAT {
    
    public static void main(String[] args) {
        
        int n,i,j,space;
        Scanner scr = new Scanner(System.in);
        System.out.println("Enter a number : ");
        n = scr.nextInt();
        for(i = n; i >= 1; i--)
        {
            for(space = n-i ; space >= 1; space--)
            {
                System.out.print("\t");
            }
            for(j = 1; j <= i; j++)
            {
                System.out.print("*\t");
            }
            System.out.println();
            System.out.println();
        }
    }
}
