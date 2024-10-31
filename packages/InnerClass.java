package packages;
// only inner class must be static  this is depend on the outerclass
// outerside class not be static beacuse it is itself dependent on self


public class InnerClass {
    // if test class is not not static then test class is depnd ont the  innnerclass
    // object of innerclass
    //  now test class is depend on the class itself rather than instance of inner class
//  it resolve in compile time
    static class Test{
 String name;
 public Test(String name){
    this.name = name;
 }
   }
   public static void main(String[] args) {
    InnerClass innerClass = new InnerClass();
    Test a = new Test("nikhil");
    System.out.println(a);
    // it show error due to it depend on the outer class
    // then it must be static
    Test b = new Test("bonthu");
    System.out.println(a.name);
    System.out.println(b.name);
   }
}
