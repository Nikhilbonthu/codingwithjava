public class Oops01Wrapper {
    public static void main(String[] args) {
        int a = 10;
        int b = 11;
        Integer num = 45;
        swap(a, b);
        Integer a1 = 10;
        Integer b1 = 11;
        swap1(a1, b1);
        System.out.println(a + " " + b);
        A a2;
        // finalise method a2 will be created ain stack memory and every for loop obj
        // pointing new object after creation

        for (int i = 0; i < 100000000; i++) {
            a2 = new A("random");
        }
    }

    // in primitive types,value are not swapped .java has only not on pass reference
    // only pass by value
    // in fuction only it get swapped but values cannt change
    static void swap(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
        System.out.println(a + " " + b);
    }

    static void swap1(Integer a, Integer b) {
        Integer temp = a;
        a = b;
        b = temp;
        final A nikhil = new A("nikhil");
        nikhil.name = "other name";

        // when a non primitive is final , you cannot reassign it.
        // nikhil = new A("new object");
    }
}

class A {
    final int num = 10;
    String name;

    public A(String name) {
        this.name = name;
    }

    @Override
    protected void finalize() throws Throwable {// destructor
        // TODO Auto-generated method stub
        System.out.println("object is destoryed");
        // if this finalise in any class then all freed object is destructed
    }
}
