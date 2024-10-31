package Oops.Polymorphism;

public class Circle extends Shapes {
    // this will run when obj of circle is created
    // hence it is overriding the parent  merthod
    @override
    // this is called annotation
    void area(){
        System.out.println("Are is pie*r*r");
    }
}
