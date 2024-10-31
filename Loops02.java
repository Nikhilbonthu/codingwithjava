import java.util.*;
public class Loops02{
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
long n=in.nextLong();
int count=0;
while(n>0){
    long rem=n%10;
    if(rem==3){
        count++;
    }
    n=n/10;
}
System.out.println(count);
    }
}