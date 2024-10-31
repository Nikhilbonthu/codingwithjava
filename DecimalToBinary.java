import java.util.*;

public class DecimalToBinary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int decimal_num = scanner.nextInt();
        int ans = 0;// binary number
        int pw = 1;
        while (decimal_num > 0) {
            int parity = decimal_num % 2;
            ans += (parity * pw);
            pw *= 10;
            decimal_num /= 2;
        }
        System.out.println(ans);
    }

}
