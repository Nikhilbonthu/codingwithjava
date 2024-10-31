package generic;

import java.util.Arrays;
import java.util.List;

public class WildcardsExample<T extends Number> {
    private Object[] data;
    private static int DEFAULT_SIZE = 10;
    private int size =0;//it is working as index value
    // create a constructor
    // for smaller one u adding Bigger one need a casting
    public WildcardsExample(){
       this. data = new Object[DEFAULT_SIZE];
    }

  public void getList(List<? extends Number> list) {
    // ? indicate include the sub class of super class (Number)



    // without you can only pass Number types
  }



   public void add(T num){
    if(this.isFull()){
       resize();
    }
    data[size++] = num;
   }
    private void resize() {
    Object[] temp = new Object[data.length * 2];

    // copy the current items in the new array 
    for(int i=0; i < data.length; i++){
        temp[i] = (data[i]);
    }
    data = temp;
}

    private boolean isFull() {
    return size == data.length;
}
public T remove(){
    T removed =(T) (data[--size]);
    return removed;
}
public T get(int index){
    return (T)data[index];
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
    
}
}
