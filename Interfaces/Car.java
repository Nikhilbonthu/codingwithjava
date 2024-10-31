package Interfaces;

public class Car implements Engine,Brakes,Media {
int a = 30;
// it work on the dynamic method dispatch => whch method is going to run
    @Override
    public void brake() {
        // TODO Auto-generated method stub
        // throw new UnsupportedOperationException("Unimplemented method 'brake'");
    System.out.println("I brake like a normal car");
    }

    @Override
    public void start() {
        // TODO Auto-generated method stub
        // throw new UnsupportedOperationException("Unimplemented method 'start'");
    System.out.println("I start engine like a normal car");
    }

    @Override
    public void stop() {
        // TODO Auto-generated method stub
        // throw new UnsupportedOperationException("Unimplemented method 'stop'");
    System.out.println(" i stop engine like a normal car");
    }

    @Override
    public void acc() {
        // TODO Auto-generated method stub
        // throw new UnsupportedOperationException("Unimplemented method 'acc'");
     System.out.println("I accelerate like normal car");
    }
    
}
