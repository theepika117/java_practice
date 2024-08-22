package strings;

import java.util.Scanner;

public class substring {

    //using string library function contains()
    // public int isSubstring(String mainString, String subString)
    // {
    //     int ans = -1;
    //     if(mainString.contains(subString))
    //     {
    //         ans = mainString.indexOf(subString);
    //         return ans;
    //     }

    //     return ans;
    // }

    //without using contains()
    public int isSubstring(String mainString, String subString)
    {
        int ans = -1;
        if(mainString.indexOf(subString.charAt(0)) != -1)
        {
            int i = mainString.indexOf(subString.charAt(0));
            if(mainString.length()-i >= subString.length())
            {
                String str = mainString.substring(i, i+subString.length());
                if(str.equals(subString))
                {
                    ans = i;
                    return ans;
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        
        Scanner scr = new Scanner(System.in);
        String mainString = scr.nextLine();
        String subString = scr.nextLine();
        substring s = new substring();
        System.out.println(s.isSubstring(mainString, subString));
    }
    
}



/*
 * theepika
    pika
    4

    hello
    123
    -1

 */