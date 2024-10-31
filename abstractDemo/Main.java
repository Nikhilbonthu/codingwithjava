package abstractDemo;

public class Main {
    public static void main(String[] args) {
        Parent son = new Son(19);
        son.career();
    //   Parent mom = new Parent();
    // u cannot create a object to the abstract class(Parent) then it must be overriding 
    
Parent.hello();
    son.normal();
    int n = son.VALUE;//it is a final keyword variable  
    System.out.println(n);
    }
}
 