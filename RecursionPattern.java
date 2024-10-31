public class RecursionPattern {
    public static void main(String[] args) {
        for (int i = 5; i > 0; i--) {
            for (int j = i; j > 0; j--) {
                System.out.print("*" + " ");
            }
            System.out.println();
        }
        System.out.println();
        patternTriangle(5, 0);
    }

    static void patternTriangle(int r, int c) {
        if (r == 0) {
            return;
        }
        if (c < r) {
            // printing only execute after the returning from the stack
            System.out.print("*" + " ");
            patternTriangle(r, c + 1);
        } else {
            System.out.println();
            patternTriangle(r - 1, 0);
        }
    }
}
