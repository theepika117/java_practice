package DSA;

public class MainSLL {

    public static void main(String[] args) {
        
        singlyLinkedList list = new singlyLinkedList();
        list.add(5);
        list.add(6);
        list.add(8);
        list.addFirst(4);
        list.delete(6);
        list.addNextTo(7, 5);
        list.printData();
    }
    
}
