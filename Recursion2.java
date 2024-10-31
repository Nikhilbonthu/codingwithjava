import java.util.*;
public class Recursion2 {
    public static void NaturalNumber(int n,int n1,int sum){
        sum=n+n1;
        System.out.println(sum);
    }
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        int n=scanner.nextInt();
       NaturalNumber (1,1,n);
        
    }
}
