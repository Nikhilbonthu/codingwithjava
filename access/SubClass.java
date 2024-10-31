package access;
// check the onenote learning page

public class SubClass extends A {

    public SubClass(int num, String name) {
        super(num, name);
        //TODO Auto-generated constructor stub
    }
    
    public static void main(String[] args) {
        SubClass obj = new SubClass(45, "nikhil");
        int n = obj.num;
    }
}
