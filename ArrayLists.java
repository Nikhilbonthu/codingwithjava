import java.util.*;
class ArrayLists{
    public static void main(String[] args) {
        ArrayList<Integer> list= new ArrayList<Integer>();
        //add elements
        list.add(0);
        list.add(1);
        list.add(2);
        System.out.println(list);
        //get elemnts8
        int element =list.get(0);
        System.out.println(element);
        //add elemnts in between
        list.add(1,1);
        System.out.println(list);
        //set element
        list.set(0,5);
        System.out.println(list);       //delete elemnet
        list.remove(3);
        System.out.println(list);
        //size̥
        int size=list.size();
        System.out.println(size);
        for(int i=0;i<list.size();i++){System.out.println(list.get(i));}
        //sorting
        Collections.sort(list);
        System.out.println(list);
        }
}