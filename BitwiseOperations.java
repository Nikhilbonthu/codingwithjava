public class BitwiseOperations {
    // Bit manipulations
    // opeartors AND 
    // xor operation a^1=>~a,a^0=>a,a^a=>0
    // left shift operator << ==> a<<1 = 2a,general point a<<b => a*2b,
    // right shift operatpr >> => a>>b = a/2^b,
    // if 2^0 is 1 then it is odd number otherwise it is a even 
    public static void main (String[] args) {
        //  given a no. is find if it is odd or even
        System.out.println(isOdd(5));
    }
    static boolean isOdd(int n){
        return (n & 1) == 1;
    }

    
}
