package ExtendingInterface;

public interface B{
  void greet();
    // void fun();
    
    default void fun() {
        System.out.println("I am in A");
    }
    // default is used for unique name not for multiple names

  
}
