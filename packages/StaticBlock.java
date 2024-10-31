package packages;
// this is a demo to show initialisation of static variables

public class StaticBlock {
    static int a = 4;
    static int b ;
    static{
        System.out.println("Iam in static block");
        // will only run once when th first obj is create i.e when the class is loaded for the 1st time

        b = a * 5;
    }
    // if staticblock  class is loaded then all static elemnets run 1st then follow on
    //  
    public static void main(String[] args) {
        StaticBlock obj = new StaticBlock();
        System.out.println(StaticBlock.a + " " + StaticBlock.b );
        StaticBlock.b += 3;
        System.out.println(StaticBlock.a + " " + StaticBlock.b );
        StaticBlock obj2 = new StaticBlock();
        System.out.println(StaticBlock.a + " " + StaticBlock.b );
        
    }
}
