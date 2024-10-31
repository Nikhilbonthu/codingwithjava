package Interfaces;

public class ElectricalEngine implements Engine {

    @Override
    public void start() {
        // TODO Auto-generated method stub
        // throw new UnsupportedOperationException("Unimplemented method 'start'");
    System.out.println("Electrical engine start");
    }

    @Override
    public void stop() {
        // TODO Auto-generated method stub
        // throw new UnsupportedOperationException("Unimplemented method 'stop'");
        System.out.println("Electrical engine stop");

    }

    @Override
    public void acc() {
        // TODO Auto-generated method stub
        // throw new UnsupportedOperationException("Unimplemented method 'acc'");
        System.out.println("Electrical engine accelerate");

    }
    
}
