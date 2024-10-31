package generic;
// creating our own ArrayList
// problem with custom Arraylist is we can only store the integeer value 
// or elememts but actually arraylist store any type of data
import java.util.ArrayList;

import java.util.Arrays;

public class CustomArrayList {
//   private meke not change directly but it can change using methods and functions
    private int[] data;
    private static int DEFAULT_SIZE = 10;
    private int size =0;//it is working as index value
    // create a constructor
    public CustomArrayList(){
       this. data = new int[DEFAULT_SIZE];
    }

   public void add(int num){
    if(this.isFull()){
       resize();
    }
    data[size++] = num;
   }
    private void resize() {
    int[] temp = new int[data.length * 2];

    // copy the current items in the new array 
    for(int i=0; i < data.length; i++){
        temp[i] = data[i];
    }
    data = temp;
}

    private boolean isFull() {
    return size == data.length;
}
public int remove(){
    int removed = data[--size];
    return removed;
}
public int get(int index){
    return data[index];
}
public int size(){
    return size;
}
public void set(int index,int value){
    data[index] = value;

}
public String toString(){
return "CustomArrayList{"+"data="+Arrays.toString(data)+",size="+size+'}';
}

    public static void main(String[] args) {
        // ArrayList list = new ArrayList();
        // list.add(45);
        // list.remove(0);
        // list.get(0);
        // list.set(1, 6789);
        // list.size();
        // list.isEmpty();
        CustomArrayList list = new CustomArrayList();
        // list.add(3);
        // list.add(5);
        // list.add(6);
        // System.out.println(list);
        //but complier only show no of elemnets in the list as size
        for(int i=0; i<14;i++){
            list.add(2 * i);
        }
        System.out.println(list);
        
        

    }
    // problem with custom Arraylist is we can only store the integeer value 
    // or elememts but actually arraylist store any type of data
}