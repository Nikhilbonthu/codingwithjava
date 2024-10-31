package Interfaces;

public class PowerEngine implements Engine {

    @Override
    public void start() {
        // TODO Auto-generated method stub
        // throw new UnsupportedOperationException("Unimplemented method 'start'");
   System.out.println("Power engine start");
    }

    @Override
    public void stop() {
        // TODO Auto-generated method stub
        // throw new UnsupportedOperationException("Unimplemented method 'stop'");
        System.out.println("Power engine stop");

    }

    @Override
    public void acc() {
        // TODO Auto-generated method stub
        // throw new UnsupportedOperationException("Unimplemented method 'acc'");
        System.out.println("Power engine accelerate");

    }
    
}
