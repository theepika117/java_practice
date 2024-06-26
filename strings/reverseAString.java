/*
 * Input:
this is javatpoint
Output:
tnioptavaj si siht
 */

package strings;
import java.util.Scanner;

public class reverseAString {

    public static void main(String[] args) {
        
        Scanner scr = new Scanner(System.in);
        String str;
        StringBuffer ans = new StringBuffer("");
        String regex = "\s";
        System.out.println("Enter a String : ");
        str = scr.nextLine();
        String[] words = str.split(regex);
        for(int i = words.length-1; i >= 0; i--)
        {
            StringBuffer temp = new StringBuffer(words[i]);
            ans.append(temp.reverse() + " ");  
        }
        System.out.println(ans);
    }
    
}



/*output:
 * Enter a String : 
hi hello how are you
uoy era woh olleh ih 
 */