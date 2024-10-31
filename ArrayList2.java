import java.util.*;
class ArrayList2{
    public static void main(String[] args){
        //wrapped classes
        Integer i=Integer.valueOf(4);
        System.out.println(i);
Float f=Float.valueOf(4.5f);
System.out.println(f);
ArrayList<Integer> a=new ArrayList<Integer>();
ArrayList<Boolean> b=new ArrayList<Boolean>();
ArrayList<Float> c=new ArrayList<Float>();     
//add new elements
a.add(5);
a.add(6);
a.add(7);
a.add(8);
System.out.println(a);
//get an elemnets at index 1;
System.out.println(a.get(1));
//print with for loops
for(int j=0; j<a.size(); j++){
System.out.println(a.get(j));
}
//printing element at some index i;
a.add(1, 100);
System.out.println(a);
//modifying element at index i;
a.set(1, 8);
System.out.println(a);
//removing an elemnets at index position;
a.remove(1);
System.out.println(a);
//removing an elemnet e;
a.remove(Integer.valueOf(7));
System.out.println(a.remove(Integer.valueOf(7)));
System.out.println(a);
//checking if an elemnet exists
boolean ans=a.contains(Integer.valueOf(60));
System.out.println(ans);
//if we dont specify class ,u can put anything inside l
ArrayList l=new ArrayList();
l.add("nikhil");
l.add(1);
System.out.println(l);

    }
}