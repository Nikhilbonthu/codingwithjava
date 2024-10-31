package Oops.Inheritance;

public class BoxWeight extends Box {
    double weight;
    public BoxWeight() {
        this.weight = -1;
}

static void greeting() {
    System.out.println("Hey,Iam in Boxweight Class.Greeting!");
}
BoxWeight(BoxWeight other){
   super(other);
   weight = other.weight; 
}
// Box box5 = new BoxWeight(1, 2, 3, 8); same as above constructor
public BoxWeight(double l ,double h,double w,double weight) {
    // above l h w are used for superclass invoking from subclass 
    super(l,h,w);
    // if superclass with parameters not called then no parameterised constructor will be called
    // parrent doesnt care about what cchild class contain
    // but child class care about the super class
    // that why parent class intialised 1st then child class
    // super is call the parent class constructor
    // used to initialize values present in parent class
    this.weight = weight;
    // super(l,h,w);=> throw an error afetr the initialised of subclass
}
public BoxWeight(double side,double weight){
    super(side);
    this.weight = weight;
}
}
 