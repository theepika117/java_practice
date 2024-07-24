package DSA;
class Node
{
    int data;
    Node next;
    public Node(int data)
    {
        this.data = data;
        next = null;
    }
}

public class singlyLinkedList {

    Node head = null;
    
    //method to add new node to the singly linked list
    public void add(int data)
    {
        Node newNode = new Node(data);
        if(head == null)
        {
            head = newNode;
        }
        else
        {
            Node current = head;
            while(current.next != null)
            {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    //method for printing the data in the nodes
    public void printData()
    {
        Node current = head;
        while(current.next != null)
        {
            System.out.print(current.data+" ");
            current = current.next;
        }
        System.out.print(current.data+" ");
        System.out.println();
    }

    //method to insert at the beginning
    public void addFirst(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
        
    }

    public void addNextTo(int data, int target)
    {
        Node newNode = new Node(data);
        Node current = head;
        while(current.next != null && current.data != target)
        {
            current = current.next;
        }
        if (current.next != null)
        {
            newNode.next = current.next;
            current.next = newNode;
        }


    }


    //method to delete an element
    public void delete(int data)
    {
        Node current = head;
        while(current.next != null && current.next.data != data)
        {
            current = current.next;
        }
        if (current.next != null)
        {
            current.next = current.next.next;
        }
        
    }


    
}
