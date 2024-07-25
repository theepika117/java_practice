package DSA;

// class Node{
//     int data;
//     Node next;
//     public Node(int data)
//     {
//         this.data = data;
//         next = null;
//     }


public class reversedLinkedList {
    
    public Node reverse(Node head)
    {
        Node prev = null;
        Node temp = null;
        while(head != null)
        {
            temp = head.next;
            head.next = prev;
            prev = head;
            head = temp;
        }
        head = prev;
        return head;
    }
   
    public static void main(String[] args) {
        
        Node head = new Node(5);
        head.next = new Node(6);
        head.next.next = new Node(7);
        head.next.next.next = new Node(8);
        head.next.next.next.next = new Node(9);
        head.next.next.next.next.next = new Node(10);
        reversedLinkedList r = new reversedLinkedList();
        Node ans = r.reverse(head);
        while (ans.next !=null) {
            System.out.print(ans.data + " ");
            ans = ans.next;
        }
        System.out.print(ans.data + " ");
        System.out.println();
        //output      10 9 8 7 6 5 
    }
    
}









//  public void reverse(Node head)
//     {
//         Node current = head;
//         Node newHead = null;
//         Node newCurrent = null;
//         while(true)
//         {
//             if(head.next == null || current.next == null )
//             {
//                 if(head.next == null)
//                 {
//                     newHead = head;
//                 }
//                 else
//                 {
//                     newCurrent = newHead;
//                     while (newCurrent.next != null) 
//                     {
//                         newCurrent = newCurrent.next;
//                     }
//                     newCurrent.next = head;
                
//                 }
//                 break;

//             }
//             while(current.next.next != null)
//             {
//                 current = current.next;
//             }
//             Node temp = current.next;
//             temp.next = null;
//             current.next = null;
//             if(newHead == null)
//             {
//                 newHead = temp;
//             }
//             else
//             {
//                 newCurrent = newHead;
//                 while (newCurrent.next != null) 
//                 {
//                     newCurrent = newCurrent.next;
//                 }
//                 newCurrent.next = temp;
//             }
            
//         }
//         newCurrent = newHead;
//         while (newCurrent.next != null) 
//         {
//             System.out.print(newCurrent.data + " ");
//             newCurrent = newCurrent.next;
//         }
//         System.out.print(newCurrent.data + " ");
//         System.out.println();

        
//     }


   

