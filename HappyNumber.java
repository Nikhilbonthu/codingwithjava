import java.util.Scanner;

public class HappyNumber {
    public static int SumOfSquare(int n){
        int sum=0;
        int r=0;
        while(n!=0){
            r=n%10;
            sum=sum+r*r;
            n=n/10;
           
        }
        
        return sum;
      
    }
public static void main(String[] args){
Scanner scanner=new Scanner(System.in);
int n=scanner.nextInt();
while(n!=0){
    n=SumOfSquare(n);

}
if(n==1){
    System.out.println("happy number");
}
}
}
