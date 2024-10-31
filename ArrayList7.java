import java.util.*;
public class ArrayList7{
    
    public static void main(String[] args)
    {
       Scanner input=new Scanner(System.in);
ArrayList<Integer> integer=new ArrayList<>();
for(int i=0;i<5;i++){
        int temp=input.nextInt();
        if(!integer.contains(temp))
        integer.add(temp);
}
Collections.sort(integer);
System.out.println(integer);
Collections.sort(integer,Collections.reverseOrder());
System.out.println(integer);
    }
}
