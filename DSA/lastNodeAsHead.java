/*
 * Write a function that moves the last node to the front in a given Singly Linked List.

    Examples:

    Input: 1->2->3->4->5
    Output: 5->1->2->3->4

    Input: 3->8->1->5->7->12
    Output: 12->3->8->1->5->7  
 */


package DSA;

import java.util.Scanner;

public class lastNodeAsHead {
    public Node getlastNode(Node head)
    {
        Node current = head;
        while(current.next.next != null)
        {
            current = current.next;
        }
        Node last = current.next;
        current.next = null;
        return last;
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
        lastNodeAsHead l = new lastNodeAsHead();
        Node last = l.getlastNode(list.head);
        list.addFirst(last.data);
        list.printData();
    }
}




/*
 * output
 * 4
    Do you want to continue (y/n) ?
    y
    Enter a value : 
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
    3
    Do you want to continue (y/n) ?
    n
    3 4 5 6 7
 */
