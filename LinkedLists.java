// import java.util.*;
class LinkedLists{//non contiguous memory
//time complexity  is less compared to array list
//insertion o(1),but searching time taken is higher o(n)
Node head = null;
// structure of linked list
class Node{
    String data;
    // data(node) is pointing another type of node so follow instruction
    Node next;
   Node(String data){//constructor
    this.data = data;
    this.next = null;
   }               
}
public void addFirst(String data){
    Node newNode=new Node(data);

    if( head == null){
head=newNode;
return;
    }
    newNode.next=head;
    head=newNode;
}
public void addLast(String data){
    Node newNode=new Node(data);
    if(head==null){
        head=newNode;
        return ;
    }
    Node currNode=head;
    while(currNode.next!=null){
        currNode=currNode.next;
    }
    currNode.next=newNode;

}

//print
public void printList(){
    if(head==null){
       System.out.println("list is empty");
       return;
    }
    Node currNode=head;
    while(currNode!=null){
        System.out.print(currNode.data+"->");
        currNode=currNode.next;
    }
    System.out.println("NULL");
}

public  static void main(String[] args){
LinkedLists list=new LinkedLists();
list.addFirst("a");
list.addFirst("is");
list.printList();
list.addLast("is");
list.printList();
list.addFirst("this");
list.printList();
}
}