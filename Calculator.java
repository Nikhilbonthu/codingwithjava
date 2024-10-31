import java.util.*;
public class Calculator{
    public static void main(String[] args){
     Scanner scanner = new Scanner(System.in); 
     int ans=0;
     while(true){
        char op=scanner.next().trim().charAt(0);
        if(op=='+' || op=='-' || op=='*'|| op=='/' || op=='%'){
int num1=scanner.nextInt();
int num2=scanner.nextInt();
if(op=='+'){
ans= num1+num2;
}
if(op=='-'){
    ans= num1-num2;
}
if(op=='*'){
    ans= num1*num2;
        }
        if(op=='/'){
            ans= num1/num2;
        }
        if(op=='%'){
            ans= num1%num2;
        }
    }  
    System.out.println("answer : "+ans);
    break;
}
}
}