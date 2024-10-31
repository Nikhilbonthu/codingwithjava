package packages;
import access.*;
public class SubClass extends A {
    
    public SubClass(int num, String name) {
        super(num, name);
        //TODO Auto-generated constructor stub
    }

    public static void main(String[] args) {
        SubClass notSubClass = new SubClass(23, "nikhil");
        // int n = notSubClass.num;
        // protected access modify is not used in world(diff pkg & not subclass)
        //    subclass can access the protected variable in superclass in different pkg
   
    }
}
