/*
 * input : a1b2c
 * output : abbc
 * 
 * number can range between 1 and 99
 */



package strings;

import java.util.Scanner;

public class alphanumeric {

    public String stringModifyer(String str)
    {
        String ans = "";
        for(int i = 0; i < str.length(); i++)
        {
            char ch = str.charAt(i);
            if(Character.isAlphabetic(ch))
            {
                ans += ch;
            }
            
            else
            {
                int j = i;
                while(j < str.length() && Character.isDigit(str.charAt(j)))
                {
                    j++;
                }
                int num = Integer.parseInt(str.substring(i, j));
                for(int k = 0; k < num-1; k++)
                {
                    ans += str.charAt(i-1);
                }
                if(j-i > 1)
                    i++;
            }
        }
      

        return ans;
    }



    public static void main(String[] args) {
        
        Scanner scr  = new Scanner(System.in);
        String str = scr.nextLine();
        alphanumeric a = new alphanumeric();
        System.out.println(a.stringModifyer(str));
    }
    
}


/*
 * output :
 * a1b15c
    abbbbbbbbbbbbbbbc

    a2bcd3e
    aabcddde

    a2b12
    aabbbbbbbbbbbb
 */
