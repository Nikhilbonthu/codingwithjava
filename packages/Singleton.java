package packages;
// only single object is created for that class
public class Singleton {
    private Singleton(){

    }
    private static Singleton instance;
    //  instance is the single object of singleton
    public static Singleton getInstance(){
if(instance == null){
    instance = new Singleton();
}
return instance;
    }
}
