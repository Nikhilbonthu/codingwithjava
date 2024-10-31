import java.util.*;
public class BinaryToDecimal {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       int Binary_num = scanner.nextInt(); 
       int ans = 0;
       int pw  = 1;
       while (Binary_num > 0) {
        int unit_digit = Binary_num % 10;
        ans +=(unit_digit*pw);
        Binary_num /= 10;
        pw*=2;

       }
       System.out.println(ans);
    }
    
}
