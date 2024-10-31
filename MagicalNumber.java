public class MagicalNumber {
    public static void main(String[] args) {
        int num = 1234;
        System.out.println(isMagicNum(num));
    }

    static boolean isMagicNum(int num) {
        int result = 0;
        while (num > 0) {
            int rem = num % 10;
            result = result + rem;
            num /= 10;
        }
        return result == 1;
    }
}
