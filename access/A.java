package access;

public class A {
    int num;
  protected int num1;
   protected String name;
    int[] arr;
    // we can access the private variables throught getter method
    public int getNum(){
        return num;
    }
    // we can access the private variables through setter method
 public void setNum(){
    this.num = num;
 }
    public A(int num,String name) {
this.num = num;
this.name = name;
this.arr = new int[34];
    }
}
