package packages;

public class SingletonMain {
    Singleton obj1 = Singleton.getInstance();
    Singleton obj2 = Singleton.getInstance();
    Singleton obj3 = Singleton.getInstance();
    //  all 3 ref variables are pointing to just one object
}
