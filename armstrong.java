
import java.util.Scanner;

public class armstrong {

    public static void main(String[] args) {
        
        Scanner scr = new Scanner(System.in);
        String str = "";
        int num,n,temp,sum = 0,x;
        System.out.println("Enter a number : ");
        num = scr.nextInt();
        if (num == 1 || num ==0)
        {
            System.out.println("Armstrong number");
        }
        else if (num < 0)
        {
            System.out.println("Enter a positive integer");
        }
        else
        {
            temp = num;
            str = String.valueOf(num);
            n = str.length();
            while(temp != 0)
            {
                x = temp % 10;
                sum += Math.pow(x,n);
                temp /= 10;
            }
            if (sum == num)
            {
                System.out.println("Armstrong number");
            }
            else{
                System.out.println("Not an Armstrong number");
            }
        }



    }
    
}
