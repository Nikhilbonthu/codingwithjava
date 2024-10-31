
import java.util.Scanner;

public class naming {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter our name : ");
        String str = sc.nextLine();
        char[] ch = str.toCharArray();
        char c1 = ch[0];
        char c2 = ch[str.length() - 1];
        int count = 0;
        for (int i = 0; i < str.length() - 2; i++) {
            count++;
        }
        System.out.print("" + c1 + count + c2 + "");
    }
}
