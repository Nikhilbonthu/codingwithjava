public class ReverseOfNum {
    public static void main(String[] args) {
        int num = 101010;
        System.err.println(Reverse(num));
    }

    static int Reverse(int num) {
        int result = 0;
        while (num > 0) {
            int rem = num % 10;
            result = result * 10 + rem;
            num /= 10;
        }
        return result;
    }
}
