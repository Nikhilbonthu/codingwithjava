public class Recursion06 {
    public static void main(String[] args) {
        System.out.println(numberOfSteps(14));
    }

    // nymber of steps to reduce a number to zero
    public static int numberOfSteps(int num) {
        return helper(num, 0);
    }

    private static int helper(int num, int step) {
        if (num == 0) {
            return step;
        }
        if (num % 2 == 0) {
            return helper(num / 2, step + 1);
        }
        return helper(num - 1, step + 1);
    }
}
