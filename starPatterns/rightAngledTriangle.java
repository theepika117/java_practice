/*
 
* 

* * 

* * * 

* * * * 

* * * * *   

 */

package starPatterns;
import java.util.Scanner;

public class rightAngledTriangle {

    public static void main(String[] args) {
        
        int n,i,j;
        Scanner scr = new Scanner(System.in);
        System.out.println("Enter a number : ");
        n = scr.nextInt();
        for(i = 1; i <= n; i++)
        {
            for(j = 1; j <= i; j++)
            {
                System.out.print("*\t");
            }
            System.out.println();
            System.out.println();
        }
    }
    
}


