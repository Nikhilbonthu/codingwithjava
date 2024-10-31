package LinkedList;

public class MainDLL {
    public static void main(String[] args) {
        DoublyLinkedList list = new DoublyLinkedList();
        list.insertFirst(3);
        list.insertFirst(2);
        list.insertFirst(4);
        list.insertFirst(13);
        list.insertFirst(17);
        list.insertLast(99);
        list.display();
        list.insert(18, 13);
        list.display();
    }
}
