/*
 * Given a singly linked list of characters, write a function that returns true if the given list is a palindrome, 
 * else false.
 * Input: R->A->D->A->R->NULL
    Output: Yes

    Input: C->O->D->E->NULL
    Output: No

 */


package DSA;
import java.util.Scanner;

class SNode
{
    String data;
    SNode next;
    public SNode(String data)
    {
        this.data = data;
        next = null;
    }
}


public class palindrome {
    
    SNode head = null;
    public void add(String data)
    {
        SNode newNode = new SNode(data);
        if (head == null)
        {
            head = newNode;
        }
        else
        {
            SNode current = head;
            while(current.next != null)
            {
                current = current.next;
            }
            current.next = newNode;
        }
    }


    

    public boolean IsPalindrome(SNode head)
    {
        StringBuffer str = new StringBuffer();
        StringBuffer rev = new StringBuffer();
        SNode current = head;
        while(current.next != null)
        {
            str.append(current.data);
            current = current.next;
        }
        str.append(current.data);
        StringBuffer temp = new StringBuffer(str);
        rev = str.reverse();
        if(rev.toString().equals(temp.toString()))
        {
            return true;
        }
        return false;
    }


    public static void main(String[] args) {
        
        palindrome list = new palindrome();
        Scanner scr = new Scanner(System.in);
        boolean flag = true;
        while(flag)
        {
            System.out.println("Enter a value : ");
            String val = scr.next();
            list.add(val);
            System.out.println("Do you want to continue (y/n) ?");
            String ch = scr.next();
            if(ch.equals("n"))
            {
                flag = false;
            }
        }
        if(list.IsPalindrome(list.head))
        {
            System.out.println("Yes");
        }
        else
        {
            System.out.println("No");
        }
    }
}




/*
 * output
 * Enter a value : 
    m
    Do you want to continue (y/n) ?
    y
    Enter a value : 
    a
    Do you want to continue (y/n) ?
    y
    Enter a value : 
    m
    Do you want to continue (y/n) ?
    n
    Yes
 */