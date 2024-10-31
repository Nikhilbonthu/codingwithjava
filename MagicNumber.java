// magic number
public class MagicNumber {
 public static void main(String[] args) {
    int n = 6;
    int ans = 0;
    int base = 5;
    while(n > 0){
        int last = n & 1;
        n = n>>1;
        ans += last * base;
 base = base * 5;
    }
    System.out.println(ans);
    System.out.println(noOfDigits());
    pascalTriangle();
 } 
// find no . of digits in base b
// (6)10==>(110)2=3
// formula  logb(a) = x  No.of digits in base  b 
public static int noOfDigits(){
int n = 34567;
int b = 10;
int ans = (int)(Math.log(n) / Math.log(b)) + 1;
return ans;
}
// pascal triangle
// for nth row ,sum = 2^n-1
// 1 << (n-1) = 1*2^n-1
public static void pascalTriangle(){
    for(int i = 1;i<=5;i++){
        for(int j = 0;j<=5 - i;j++){
        System.out.print(" ");
        }
        int c = 1;
        for(int j = 0;j<=5;j++){
            System.out.println(c + " ");
            c = c*(5 - i)/i;

    }
    System.out.println();
}

}
   

}
