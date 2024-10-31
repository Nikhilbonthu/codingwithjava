public class MathOperations01 {
    public static void main(String[] args) {
        int ans = SumOfDigits(1324);
        System.out.println(ans);
        int result = ProductOfDigits(1324);
        System.out.println(result);
    }
    // recursive function 
static int SumOfDigits(int n){
    if(n == 0){
        return 0;
    }
return (n % 10) + SumOfDigits(n/10);
}
static int ProductOfDigits( int n)
{
 if(n % 10 == n){
    return n;
 }
 return (n % 10) * ProductOfDigits(n/10);
}
}

