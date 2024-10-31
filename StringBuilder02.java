import java.util.*;

public class StringBuilder02 {
    // palindrome program
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        System.out.println(isPalindrome(str));

    }

    static boolean isPalindrome(String str) {
        if (str == null || str.length() == 0) {
            return true;
        }
        str = str.toLowerCase();
        for (int i = 0; i < str.length() / 2; i++) {
            char start = str.charAt(i);
            System.out.println(start);
            char end = str.charAt(str.length() - 1 - i);
            System.out.println(end);
            if (start != end) {
                return false;
            }
        }
        return true;
    }
}
