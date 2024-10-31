public class Practice01 {
    public static void main(String[] args) {
        for (int i = 69; i >= 65; i--) {
            for (int j = 1; j <= 69 - i + 1; j++) {
                System.out.print((char) (i) + " ");
            }
            System.out.println();
        }
    }
}
