import java.util.Scanner;

public class FibonacciNumber {
 public static void main(String[]args){
    Scanner input=new Scanner(System.in);
    int n=input.nextInt();
System.out.println(fibo(n));
 }   
 static int fibo(int n){
    // fibO(N)=fibo(N-1)+fibo(N-2);=>recursive relation
    //base condition f(0)=0,f(1)=1,f(2)=2
    if(n<2){
        return n;
    }
return fibo(n-1)+fibo(n-2);
}
}