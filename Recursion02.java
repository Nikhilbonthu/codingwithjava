public class Recursion02 {
    public static void main(String[] args) {
       fun(1);
       System.out.println(Fact(5));
    }
   static void fun(int n){
    if(n == 6){
        return;
    }
    System.out.println(n);
    fun(n + 1);
   }
//    factorial number
   static int Fact(int m){
    if(m <= 0){
        return 1;
    }
      return m * Fact(m - 1);
   }
//    sum of digits
  static void SumOfDigits(int num){
    
  }
}
