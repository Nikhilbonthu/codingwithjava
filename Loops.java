import java.util.*;
public class Loops{
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        int a=scanner.nextInt();
        int b=scanner.nextInt();
        int c=scanner.nextInt();

        int max=a;
        if(b>max){
            max=b;
        }
        if(c>max){
            max=c;
 
        }
        System.out.println(max);
        int ans=Math.max(max, b);
        System.out.println(max);
}
}
