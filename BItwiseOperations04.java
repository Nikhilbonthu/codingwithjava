public class BItwiseOperations04
{
public static void main(String[] args) {
    int n = 16;
    // note : fix for n = 0 ;
    boolean result = (n&(n-1))== 0;
    System.out.println(result);
    exponentialNumber();
    noOfSetBits();
    System.out.println(setBits(n));
    
    // int ni = 10;
    // System.out.println(Integer.toBinaryString(ni));
}
// calculate a^b
// O(log(b))
public static void exponentialNumber(){
    int base = 3;
    int power =  6;
    int ans = 1;
    while(power > 0){
        if((power & 1)==1){
            ans*=base;

        }
        base *= base;
power = power >>1;

    }
    System.out.println((ans));
}
// given a number n , find the no of set bits in it
public static void noOfSetBits(){
    int n = 9;
    int count = 0;
    while(n > 0){
        if((n & 1) == 1){
          count++;
        }
        n = n >> 1;
    }
    System.out.println(count);
}
public static int setBits(int n){
   int count = 0;
 while(n > 0){
count++;
n-=(n & -n);
// or n = n & (n-1)
 }
   return count;
}
// find the xor of nos from 0 to a 

}
