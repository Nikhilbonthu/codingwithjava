package LinkedList;
// Recursion insertion in linkedlist
public class LLproblem {
    Node head;
    Node tail;
    
    private class Node{
        int value;
        Node next;
        public Node(int value) {
            this.value = value;
            this.next = null; 
        }
        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }
    public void insert(int value,int index){
      Node temp =head;
       for(int i = 1;i<index;i++){
        temp = temp.next;
       }
       Node newNode = new Node(value,temp.next);
       temp.next = newNode;
         

    }


}
