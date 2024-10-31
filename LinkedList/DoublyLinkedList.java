package LinkedList;
// doubly linke dlist is used for backward transversal 
public class DoublyLinkedList {
   private  Node head;
    private Node tail;
    private int size;
    public DoublyLinkedList() {
    this.size = size;
    }
    public void insertFirst(int value) {
        Node node = new Node(value);
        node.next = head;// pointing to the head node
        node.prev = null;// pointing to the previous node and making changing
        if (head != null) {
            head.prev = node;// heaad pointing to the previous node

        }
        head = node;
    }
    public void insertLast(int value) {
        Node node = new Node(value);
     Node last = head;
 node.next = null;
if(head == null){
    node.prev = null;
    head = null;
    return;
}
     while(last.next != null){
        last = last.next;
     }
     last.next = node;
     node.prev = last;
    }

public void insert(int value,int after){
   Node p = find(after);
   if(p == null){
    System.out.println("does not exist");
    return;
   }
   Node node = new Node(value);
   node.next = p.next;
   p.next = node;
   node.prev = p;
   if(node.next != null){

       node.next.prev = node;
   }
}
public Node find(int value) {
    Node node = head;
    while (node != null) {
        if (node.value == value) {
            return node;
        }
        node = node.next;
    }

    return null;
}
    public void display() {
        Node node = head;
        Node last = null;
        while (node != null) {
            System.out.print(node.value + "-> ");
            last = node;
            node = node.next;// reassigning the node
        }
        System.out.println("END");
        // System.out.println("printing in reverse");
        // while (last != null) {
        //     System.out.print(last.value + "->");
        //     last = last.prev;

        // }
        // System.out.println("START");
    }

    private class Node {
        int value;
        Node next;
        Node prev;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next, Node prev) {
            this.value = value;
            this.next = next;
            this.prev = prev;
        }
    }
}