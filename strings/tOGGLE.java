/*
 * Write a Java program to toggle each word in a string
 */

package strings;
import java.util.Scanner;

public class tOGGLE {

    public static void main(String[] args) {

        Scanner scr = new Scanner(System.in);
        String str="",ans = "";
        String regex = "\s";
        System.out.println("Enter a string : ");
        str = scr.nextLine();
        String[] words = str.split(regex);
        for (String word : words)
        {
            for(int j = 0; j < word.length(); j++)
            {
                char ch = word.charAt(j);
                if(Character.isUpperCase(ch))
                {
                    ans += Character.toLowerCase(ch);
                }
                else if(Character.isLowerCase(ch))
                {
                    ans += Character.toUpperCase(ch);
                }
                else
                {
                    ans += ch;
                }
            }
            ans += " ";
        }
        System.out.println(ans);
        
    }

    
}

/*
 * output
 * Enter a string : 
Hello TheepS 117
hELLO tHEEPs 117 
 */
