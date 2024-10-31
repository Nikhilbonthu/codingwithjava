import java.util.*;
public class Recursion1 {
  public static void PrintNumber(int n){
    if(n<=5){
    return ;
    }
    System.out.println(n);
    PrintNumber(n-1);
  }
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
int n=scanner.nextInt();
    PrintNumber(n);
  }
}
