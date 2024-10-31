package ExtendingInterface;

public class Main implements B,A{

    @Override
    public void fun() {
        // TODO Auto-generated method stub
        // throw new UnsupportedOperationException("Unimplemented method 'fun'");
   
    }

    @Override
    public void greet() {
        // TODO Auto-generated method stub
        // throw new UnsupportedOperationException("Unimplemented method 'greet'");
   
    }
    public static void main(String[] args) {
        Main obj = new Main();
        // then static method call by name of classs
        // call via the interface name  
        A.greeting();
        
    }

   
    
}
