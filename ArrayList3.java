import java.util.*;
class ArrayList3{

static void ReverseList(ArrayList<Integer> list){
    int i=0,j=list.size()-1;
    while(i<j){
Integer temp=Integer.valueOf(list.get(i));
list.set(i,list.get(j));
list.set(j,temp);
i++;
j--;
}
}
public static void main(String[] args) {
    ArrayList<Integer> list = new ArrayList<>();
list.add(0);
list.add(10);
list.add(3);
list.add(5);
list.add(22);
list.add(10);
System.out.println(list);
// ReverseList(list);

Collections.reverse(list);
System.out.println("reverse:"+list);


Collections.sort(list);
System.out.println(list);//ascending order;


//descending order
Collections.sort(list,Collections.reverseOrder());
System.out.println(list);

//String problem
ArrayList<String> list1=new ArrayList<String>();
list1.add("welcome");
list1.add("to");
list1.add("java");
Collections.sort(list1);
System.out.println(list1);
Collections.sort(list1,Collections.reverseOrder());
System.out.println(list1);
}
}