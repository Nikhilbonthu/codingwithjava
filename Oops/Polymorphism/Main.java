package Oops.Polymorphism;

public class Main {
    public static void main(String[] args) {
        Shapes shape = new Shapes();
        // circle is a subclass means it can access refrence  variables 
        // so we write as shapes circle = new Circle()=>object type
        // what methods and variables can access is depend on the left side shapes
        Shapes circle = new Circle();
        Square square = new Square();
        shape.area();
        circle.area();
    }
}
