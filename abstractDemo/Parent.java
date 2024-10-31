package abstractDemo;
// it is not support multiple inheritance
 public abstract class Parent {
    int age;
    final int VALUE;
    public Parent(int age) {
        //TODO Auto-generated constructor stub
        this.age =age;
        VALUE = 234567;
    }
    // parent only gives the choice to the sub class
    // u cannot abstract constructor in abstrct class
    // it cannot create object for abstract class beacuse body is empty=> give error
    abstract  void career();
    abstract  void pertner();
    // abstract static methods cannot be overridden 
    // but static methods are allowed due to  cannot be overridden
    static void hello(){
        System.out.println("hello");
    }
    // abstract class can allow to contain normal methods
    void normal(){
        System.out.println("this is a normal method");
    }
    
}
