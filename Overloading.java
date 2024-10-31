public class Overloading {//same method name but different arguments
    public static void main(String[] args) {
        fun(20);
        fun("nikhil");
    }
    static void fun(int a){
        System.out.println(a);
    }
    static void fun(String name){
        System.out.println(name);
    }
}
