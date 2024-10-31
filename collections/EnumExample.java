package collections;

public class EnumExample implements A {
    // enum only extends to one class and enum is not a superclass
    enum Week {
        monday,tuesday,wednesday,thursday,friday,saturday,sunday;
        // these are enum constants
        // every meber in is public , static and final
        // since its final you can create child enums
        // type is week
  Week(){
    System.out.println("Constructor called for  "+this);
  }
//   this is not public or protected , only private or default
// if public and protected  allow  initialization of more than one object
// we need only particular amount of object
// why? we dont want to create new object
// this is not the enum concept , that why
// internally public static final Week monday = new Week();

public void hello() {
    // TODO Auto-generated method stub
    System.out.println("Hello,how are u?");}
    

}
    public static void main(String[] args) {
        Week week;
        week = Week.monday;
        week.hello();
        System.out.println(week.valueOf("monday"));
        // for(Week day : Week.values()){
        //     System.out.println(day);
        // }
        // System.out.println(week.ordinal());
        // ordinal give the index or position of constants
    }
    @Override
    public void hello() {
        // TODO Auto-generated method stub
        // throw new UnsupportedOperationException("Unimplemented method 'hello'");
    }
   
    
}
