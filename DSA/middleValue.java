/*
 * Input: linked list = 1 -> 2 -> 3 -> 4 -> 5
    Output: 3 
    Explanation: There are 5 nodes in the linked list and there is one middle node whose value is 3.

    Input: linked list = 1 -> 2 -> 3 -> 4 -> 5 -> 6
    Output: 4 
    Explanation: There are 6 nodes in the linked list, so we have two middle nodes: 3 and 4, 
    but we will return the second middle node which is 4.
 */

package DSA;
import java.util.Scanner;



public class middleValue {

    public int findMiddle(int mid, Node head)
    {
        
        Node current = head;
        for(int i = 1; i < mid; i++)
        {
            current = current.next;
        }

        return current.data;
    }
    


    public static void main(String[] args) {
        
        Scanner scr = new Scanner(System.in);
        int  midIndex;
        singlyLinkedList list = new singlyLinkedList();
        boolean flag = true;
        while(flag)
        {
            System.out.println("Enter a value : ");
            int val = scr.nextInt();
            list.add(val);
            System.out.println("Do you want to continue (y/n) ?");
            String ch = scr.next();
            if(ch.equals("n"))
            {
                flag = false;
            }
        }
        int length = list.findLength();
        midIndex = length/2+1;
        list.printData();
        middleValue m = new middleValue();
        System.out.println(m.findMiddle(midIndex,list.head));
    }


    
}



/*
 * output
 * Enter a value : 
    5
    Do you want to continue (y/n) ?
    y
    Enter a value : 
    6
    Do you want to continue (y/n) ?
    y
    Enter a value : 
    7
    Do you want to continue (y/n) ?
    y
    Enter a value : 
    8
    Do you want to continue (y/n) ?
    n
    5 6 7 8 
    7
 */
