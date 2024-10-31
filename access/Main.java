package access;

public class Main extends A {
    public Main(int num, String name) {
        super(num, name);
        //TODO Auto-generated constructor stub
        
    }

    public static void main(String[] args) {
        A obj = new A(21, "nikhil");

        // need to do few things
        //  1.access the data members
        // 2.modify the data members
System.out.println(obj.getNum());
// in case of method we call methods directly
// in case instance variable we need to create a new reference variable
// private means only in this file
// public means everywhere
int n=obj.num1;//no access modifer specify for the variable
// protected means only subclass can access the variable in other pkg


}
}
