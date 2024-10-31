public class Palindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome(101011));
    }

    public static int isPalindrome(int x) {
        int rev = 0;
        while (x > 0) {
            int rem = x % 10;
            rev = rev * 10 + rem;
            x = x / 10;

        }
        return rev;
    }
}
