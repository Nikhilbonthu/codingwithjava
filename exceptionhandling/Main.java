package exceptionhandling;

public class Main {
    public static void main(String[] args) {
        int a = 5;
        int b = 0;
        try {
            // try anything in the body of the try block in case any exception go to the
            // catch block
            // int c = a / b;
            // divide(a, b);
            // miniking 
            // throw new Exception("jst for fun");
            String name = "nikhil";
            if(name.equals("nikhil")){
                throw new CustomException("my name is nikhil");
            }
        }catch(CustomException e){
        System.out.println(e.getMessage());
        }
        // always use subclass exception first in catch blocks=>this leads to error because
        // exception contain all exceptions 
        catch (Exception e) {
            // e is the object of the Exception
            System.out.println("normal exception");
        }
        // finally block create only once for the executiom
        finally {
            System.out.println("this will always execute");
        }
    }
    static int divide(int a , int b) throws ArithmeticException{
        if(b == 0){
            throw new ArithmeticException("if explicitely  throw msg used it");
    //    throw means jst throw exception
    // throws means used to declared a exception
        }
        return a / b;
    }
}
