package DSA;

public class MainSLL {

    public static void main(String[] args) {
        
        singlyLinkedList list = new singlyLinkedList();
        list.add(5);
        list.add(6);
        list.add(8);
        list.addFirst(4);
        list.printData();
        list.delete(6);
        list.addNextTo(7, 5);
        list.search(8);
        list.search(1);
        list.add(9);
        list.printData();
        System.out.println(list.findLength());
    }
    
}



/*
 * output
 * 4 5 6 8 
    Element found
    Element not found
    4 5 7 8 9
    5
 */
