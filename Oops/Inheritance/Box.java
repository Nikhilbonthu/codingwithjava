package Oops.Inheritance;
public class Box
{
    private double l;

    double h;
    double w;
    static void greeting(){
        System.out.println("Hey,Iam in Box Class.Greeting!");
    }
    public double getL(){
        return l;
    }
    Box(){
        this.l = -1;
        this.h = -1;
        this.w = -1;
    }
    // create a cube
    Box(double side){
        this.l = side;
        this.h = side;
        this.w = side;
    }
    Box(double l ,double h,double w){
        System.out.println("this is box of superclass");
        this.l = l;
        this.h = h;
        this.w = w;
    }
    Box(Box old){
        this.l = old.l;
        this.h = old.h;
        this.w = old.w;
    }
    public void information(){
        System.out.println("running the box");
    }
    }
