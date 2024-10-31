package LinkedList;

// custom linkedlist implementation
// in single linkedlist it has unidirectional access 
public class SingleLinkedList{
    private Node head;
    // head is in the stack memory
    private Node tail;
    private int size;

  public SingleLinkedList() {
        this.size = 0;
    }
// insertion in array is o(n) times but in linkedin list is o(1) times
public void insertFirst(int value){
    Node node = new Node(value);
    node.next = head;
    head = node;
    if(tail == null){
        tail = head;
    }
    size+=1;
}
public void display(){
    Node temp = head;
    while(temp != null){
        System.out.print(temp.value + "->");
        temp = temp.next;
    }
    System.out.println("END");
}

// insertion in last and time complexity is O(1) times or constant time
public void insertLast(int value){
    if(tail == null){
        insertFirst(value);
    }
    Node node = new Node(value);
    tail.next = node;
    tail = node;
    size+=1;
}

// insert at particular position
public void insert(int value,int index){
if(index == 0){
insertFirst(value);    
return;
}
if(index == size){
    insertLast(value);
    return;
}
// head is already in 0 index 
Node temp = head;
for(int i =1;i < index;i++){
temp = temp.next;
}
Node newNode = new Node(value,temp.next);
temp.next = newNode;
size+=1;

}
public int deleteLast(){
    if(size <= 1){
        return deleteFirst();
    }
    Node secondLast = get(size - 2);
    int value = tail.value;
    tail = secondLast;
    tail.next = null;
    return  value;
}
public Node get(int index){
 Node node = head;
 for(int i =1;i < index;i++){
 node = node.next;
 }
 return node;
}
public int deleteFirst(){
    int value = head.value;
    head = head.next;
    if(head == null){
        tail = null;
    }
    size--;
return value;
}
public int delete(int index){
   if(index == 0){
    return deleteFirst();
   }  
   if(index == size - 1){
    return deleteLast();
   }
   Node prev = get(index - 1);
   int value = prev.next.value;
   prev.next = prev.next.next;
return value;
}

public Node find(int value) {
    Node node = head;
    while(node != null){
        if(node.value == value){
            return node;
        }
        node = node.next;
    }

    return node;
}
private class Node{
   private int value;
   private Node next; 


public Node(int value) {
    this.value = value;
    this.next = null;
}


public Node(int value, Node next) {
    this.value = value;
    this.next = next;
}
 
  }
}
