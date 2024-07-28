/*
 * Longest Substring Without Repeating Characters
    Input: "abcabcbb"
    Output: 3 (The longest substring is "abc")
 */
package strings;
import java.util.Scanner;

public class largestSubstring {
    public static void main(String[] args) {
        
        Scanner scr = new Scanner(System.in);
        String userInput , unique = "";
        System.out.println("Enter a string : ");
        userInput = scr.nextLine();
        for(int i = 0; i < userInput.length(); i++)
        {
            char ch = userInput.charAt(i);
            if(!(unique.contains(Character.toString(ch))))
            {
                unique += ch;
            }
        }
        System.out.println(unique.length());
    }
    
}

/*
 * output
 * Enter a string : 
    gggggggggghsjjjjjjjjsssssssss
    4
 */
