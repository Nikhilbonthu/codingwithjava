import java.util.Arrays;

public class Stringbasics {
    public static void main(String[] args) {
        String str = "nikhil";// =>datatype reference variable =object
        String str1 = "keerthi";
        String str2 = str1 + str;
        System.out.println(str2);   
        // string pool is nothing but a block memory in heap space
        // all similar not created again in separet memory in heap space
        // optimise the program
        // same reference variable pointed to the same object
        // string are immutable in java for security like password
        String a = "nikhil";
        String b = "nikhil";
        // a="keerthi";//not change the object but creating anew object ,old object get
        // into garbage collection
        // System.out.println(a);
        // why immutability
        // two of comparision
        // == method(check): a==b is true when both refernece variable pointing to same
        // object
        // == method: a==b is false when both refernece variable pointing to different
        // object

        // System.out.println(a==b);
        // how to create different object of same values
        // String name= new String("object");
        // ?new keyword is used to create object
        String name = new String("nikhil");
        String name1 = new String("nikhil");
        System.out.println(name.equals(name1));
        System.out.println(name1.charAt(0));
        System.out.println(Arrays.toString(new int[] { 1, 2, 3, 4, 3 }));
        String name2 = null;
        System.out.println(name2);

    }

}
