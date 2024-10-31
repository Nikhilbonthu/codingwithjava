package abstractDemo;

public class Son extends Parent {
public Son(int age){
    super(age);
}
void mormal(){//it also overriden by sub class
    super.normal();
}
    @Override
    void career() {
        // TODO Auto-generated method stub
        // throw new UnsupportedOperationException("Unimplemented method 'career'");
     System.out.println("iam going to a doctor ");
    }

    @Override
    void pertner() {
        // TODO Auto-generated method stub
        // throw new UnsupportedOperationException("Unimplemented method 'pertner'");
   
   System.out.println("i love she is"); }
    
}
