package Cloning;

public class Human implements Cloneable{
    // cloneable doesnt contain anything 
     int age;
     String name;
     int[] arr;
     
    public Human(int age, String name) {
        this.age = age;
        this.name = name;
        this.arr = new int[] {3,4,5,6,9,1};
    }
//     public Human(Human other) {
// this.age = other.age;
// this.name = other.name;
//     }
    // we are jst tell the jvm to we are using clone on the object of human
//      public Object clone() throws CloneNotSupportedException{
//         // this is shallow copy
//        return super.clone();
//      }
 public Object clone() throws CloneNotSupportedException{
    
    Human twin = (Human)super.clone();//this is shallow copy
    //make a deep copy
     twin.arr = new int[twin.arr.length];
    for(int i=0;i<twin.arr.length;i++){
        twin.arr[i] = this.arr[i];
    }
    // OR
    // System.arraycopy(this.arr, 0, twin.arr, 0, twin.arr.length);
    return twin;
 }
 }
