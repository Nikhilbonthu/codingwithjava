import java.util.*;
public class ArrayListproblem01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>(10);
// list.add(67);
// list.add(76);
// System.out.println(list.contains(73));
// list.set(0, 76);
// list.remove(0);
// int number=list.size();
// System.out.println(number);
//input 
for (int i=0; i<5; i++)
list.add(scanner.next());

    for(int i=0; i<5;i++){
        System.out.println(list.get(i)+ "  ");
        
    }
    System.out.println(list);
    }
}
