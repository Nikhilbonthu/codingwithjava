package Oops.Inheritance;

public class BoxPrice extends BoxWeight {
   double cost;
    BoxPrice(){
        // super() calls the  supercalls=>BoxWeight
        super();
        this.cost = -1;

    }
    BoxPrice(BoxPrice other){
        super(other);
        this.cost = other.cost;

    }
     public BoxPrice(double l ,double h ,double w,double weight,double cost){
        super(l,h,w,weight);
        this.cost = cost;

     }
     public BoxPrice(double side, double weight,double cost){
         super(side,weight);
         System.out.println("hello,Boxprice"); 
this.cost = cost;
     }

}
