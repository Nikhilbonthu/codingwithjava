import java.util.Scanner;

public class Problem11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        char[] ch = str.toCharArray();
        char c1 = ch[0];
        char c2 = ch[str.length() - 1];
        int count = 0;
        for (int i = 0; i < str.length() - 2; i++) {
            count++;
        }
        // System.out.print(ch[0]);
        // System.out.print(count);
        // System.out.print(ch[str.length()-1]);
        System.out.println("value\n"+ c1 + count + c2+" \nlast");

    }

}
