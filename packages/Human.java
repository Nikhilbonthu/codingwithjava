package packages;

public class Human {
    int age;
    String name;
    int salary;
    boolean married;
    static long population = 100000000;
    static void meassage(){
        
    }
    public Human(int age, String name, int salary, boolean married) {
        this.age = age;
        this.name = name;
        this.salary = salary;
        this.married = married;
        Human.population += 1;
    }
}
