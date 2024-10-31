import java.util.*;
class CollectionFrame{//collection interface
    static void ArrayListExamples(){
ArrayList<Integer> l=new ArrayList<>();
l.add(1);
l.add(2);
l.add(3);
l.add(4);
System.out.println(l);
System.out.println(l.get(1));//1-based indexing=>2;
l.set(1,10);
System.out.println(l);


    }
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        //interface is blueprint of a class 
        
ArrayListExamples();

    }
}