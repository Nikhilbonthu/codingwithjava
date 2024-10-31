package Oops.Inheritance;

public class BoxMain {
    public static void main(String[] args) {
        Box box1 = new Box(4.6, 7.6, 9);
        box1.getL();
        // l in private acess modify .define in oun class but calling it different
        // Box box2 = new Box(box1);
        // System.out.println(box1.l+" "+box1.w+" "+box1.h);
        // System.out.println(box2.l+" "+box2.w+" "+box2.h);
        // BoxWeight box3 = new BoxWeight();
        // System.out.println(box3.h+" "+box3.weight);
        // Box of
        // Box box5 = new BoxWeight(1, 2, 3, 8);
        // System.out.println(box5.weight);
        // there are many variables in both parent and child classes
        // but here , when the obj itself of type parent class , how will you call the
        // constructor of child class
        // that is why error exists
        BoxPrice box = new BoxPrice(5, 8, 200);
        Box.greeting();
        Box box6 = new BoxWeight();
        box6.greeting();
        BoxWeight.greeting();
        // youncan inherit but u cannot override
 
    }

}
