public class Problem04 {
    public static void main(String[] args){
         int n = 4;
         System.out.println(isPowerOfTwo(n));
    }
    public static boolean isPowerOfTwo(int n){
    long i = 1;
    while(i<n){
    i = i * 2;
    }
if(i == n){
return true;
}else{
    return false;
}
    }
}
