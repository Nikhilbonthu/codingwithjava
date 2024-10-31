public class Recursion03 {
    public static void main(String[] args) {
        ReverseOfNumber(1234);
        System.out.println(sum);
        System.out.println(ReverseOfNumber1(1234));
 }   
 static int sum = 0;
 static  void  ReverseOfNumber(int n){
if(n == 0){
    return;
}
int rem = n % 10;
sum = sum * 10 + rem ;
ReverseOfNumber(n / 10);
 }
 static int ReverseOfNumber1(int n){
// sometime you might need some additional variable in the argument
// in that case,make another function
int digits = (int)(Math.log10(n) + 1);
return helper(n,digits);
 }
 private static int helper(int n , int digits){
    if(n%10 == n){
        return n;
    }
    int rem = n % 10;
    return rem *(int) Math.pow(10, digits - 1) + helper(n / 10, digits - 1);
 }
}
