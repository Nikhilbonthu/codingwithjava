import java.util.*;
class Saperation{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n=scanner.nextInt();
        // int sum=0;
        // while(n>0){
        //     int num=n%10;
        //     sum=sum+num;
        //     n/=10;

        // }
        // System.out.println(n);
        System.out.println(saperation(n));

    }
    static int saperation(int n){
        int sum=0;
        while(n>0){
            int num=n%10;
            sum+=num;
            n=n/10;
            System.out.println(n);
        }
        
       return sum;
    }
}