public class Recursion04 {
 public static void main(String[] args) {
    System.out.println(Palindrome(123321));
 }   

 static boolean Palindrome(int n){
return (n == ReverseOfNumber1(n));
 }
 static int sum = 0;
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
