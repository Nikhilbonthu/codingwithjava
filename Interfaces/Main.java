package Interfaces;

public class Main {
    public static void main(String[] args) {
        Engine car = new Car();
        // what is access by Engine or instance variable
        // which isversion  access depend on the type of object=>Car()
        // implement in sub class 
        // both super class and sub class are present at the java compile time
        // car.acc();
        // car.start();
        // car.stop();
        
        // interface ,it is disconnect the definition  of method from heiey of inheritance
        // because it implement in sub class
    // interface inheritance  ,doesnt care about how class are related to each other or not
    // normal  inheritance care about classes
    // interface is not used in performance critical
// Media carMedia = new Car();
// carMedia.stop();
NiceCar car1 = new NiceCar();

car1.start();
car1.startMusic();
car1.upgradeEngine();
car1.start();

    }
}
