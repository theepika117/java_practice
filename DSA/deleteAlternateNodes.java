/*
 * Given a Singly Linked List, starting from the second node delete all alternate nodes of it. 
 * For example, if the given linked list is 1->2->3->4->5 then your function should convert it to 1->3->5, 
 * and if the given linked list is 1->2->3->4 then convert it to 1->3.
 */


package DSA;

import java.util.Scanner;

public class deleteAlternateNodes {
    public void deleteNodes(singlyLinkedList list, int length)
    {
        Node current = list.head;
        for(int i = 1; i <= length; i++)
        {
            if (i % 2 == 0)
            {
                list.delete(current.data);
            }
            current = current.next;
        }
    }

    public static void main(String[] args) {
        
        singlyLinkedList list = new singlyLinkedList();
        Scanner scr = new Scanner(System.in);
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
        int len = list.findLength();
        deleteAlternateNodes d = new deleteAlternateNodes();
        d.deleteNodes(list, len);
        list.printData();
    }
}





/*
 * output
 * Enter a value : 
    1
    Do you want to continue (y/n) ?
    y
    Enter a value : 
    2
    Do you want to continue (y/n) ?
    y
    Enter a value : 
    3
    Do you want to continue (y/n) ?
    y
    Enter a value : 
    4
    Do you want to continue (y/n) ?
    y
    Enter a value : 
    5
    Do you want to continue (y/n) ?
    n
    1 3 5 
 */