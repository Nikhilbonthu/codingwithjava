package Cloning;

import java.util.Arrays;

public class Main {
 public static void main(String[] args) throws CloneNotSupportedException {
    Human nikhil = new Human(22,"bonthu");
    // Human twin = new Human(nikhil);
    // clone => lang pkg
Human twin = (Human)nikhil.clone();
System.out.println(twin.age+" "+twin.name);
System.out.println(Arrays.toString(twin.arr));;
twin.arr[0] = 100;
System.out.println(Arrays.toString(nikhil.arr));
// nikhil arr is also changing because of changing twin arr it is called Shallow copy

 }   
}
