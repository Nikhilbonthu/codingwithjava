public class MathOpeartions {
    public static void main(String[] args) {
        int N = 36;
//         for(int i = 1;i <= N;i++) {
// if(N % i==0){
// System.out.println(i)  ;
// }
//     }

   
    for(int i = 1;i <= N;i++) {
        System.out.println(i + " "+ isprime(i) ) ;
}
// int m = 40;
// findRange(m);
    }
// number is prime or not
public static boolean isprime(int n){
    if(n<=1){
        return false;
    }
    int c = 2;
    while(c * c <= n){
        if(n % c ==0){  
            return false;
        }
        c++;
    }
    return true;
}
// find the all range of prime numbers
static void findRange(int n){
for(int i = 1; i < n; i++){
    if(n % i == 0){
        System.out.println("it is prime  number "+i);
}
else{
    System.out.println("it is not prime number "+i);
}

}
}
}