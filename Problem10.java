import java.util.Scanner;

public class Problem10 {
    public static void main(String[] args) {
        for (int i = 10; i > 0; i--) {
            for (int j = i - 1; j > 0; j--) {
                System.out.print("0" + " ");
            }
            System.out.println(i);
        }
        System.out.println();
    }
}
