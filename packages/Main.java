package packages;

import packages.*;

public class Main {
    public static void main(String[] args) {
        Human nikhil = new Human(21, "nikhil", 100000, false);
        Human Nani = new Human(21, "Nani", 200000, true);
        Human Bonthu = new Human(21, "Bonthu", 200000, true);

        System.out.println(nikhil.name);
        System.out.println(Human.population);
        // static variable  or function doesnt depend on object and reference variable
        // but depend on the class variable
        System.out.println(Human.population);
        System.out.println(Human.population);
        fun();
        Main obj = new Main();
        obj.fun2();
    }

    // we know that something which is not static belongs to an object
    static void fun() {
        // you cannot access non static stuff without a reference variable in a static
        // context
// create u r own object for access of fuction variable
        Main obj = new Main();
        obj.greeting();
    }
    void fun2(){
        greeting();
    }

    void greeting() {
        System.out.println("hello world");
    }
}