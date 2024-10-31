package NestedInterface;

public class A {
    // nested interface
    // we can declared interface with public,private and protected
    // but top level interface it should be public and default
    public interface NestedInterface {
        boolean isOdd(int num);

        
    }
}
// A.NestedInterface means interface inside A class  
class B implements A.NestedInterface{

    @Override
    public boolean isOdd(int num) {
    return (num & 1) == 1;
    }
    
}

