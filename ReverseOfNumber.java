import java.util.Scanner;

public class ReverseOfNumber {
    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in); 
      int n=scanner.nextInt();
      int ans=0;
      while(n>0){
        int rem=n%10;
        n/=10;
        ans=ans*10+rem;
      }
      System.out.println(ans);
    }
   
}
