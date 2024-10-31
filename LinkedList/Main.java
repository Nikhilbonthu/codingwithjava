package LinkedList;

public class Main {
    public static void main(String[] args) {
        SingleLinkedList list = new SingleLinkedList();
        list.insertFirst(3);
        list.insertFirst(2);
        list.insertFirst(4);
        list.insertFirst(13);
        list.insertLast(99);
        list.insert(100, 3);
        list.display();
        System.out.println(list.deleteFirst());
        list.display();
        System.out.println(list.deleteLast());
        list.display();
        System.out.println(list.delete(2));
        list.display();
    }
    
}
