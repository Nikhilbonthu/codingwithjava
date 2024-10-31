import java.util.*;
public class ArrayListProblem {
    public static void main(String[] args) {
Scanner scanner=new Scanner(System.in);
int n=scanner.nextInt();
for(int i=0; i<n; i++) {
    int d=scanner.nextInt();
ArrayList<Integer> al=new ArrayList<>();
for(int j=0;j<d;j++){
int num=scanner.nextInt();
al.add(num);
}
System.out.println(al);
}
}
}
