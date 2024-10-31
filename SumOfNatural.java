import java.util.Scanner;
public class SumOfNatural {
public static void main(String[] args)
{
    Scanner scanner = new Scanner(System.in);
    sumofnumber(1,5,0);
}
public static void sumofnumber(int i,int n,int sum){
if(i==n){
    sum+=i;
    System.out.println(sum);
    return;
}
    sum+=i;
    System.out.println(i);
    sumofnumber(i+1,n,sum);
}
}







