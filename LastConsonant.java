import java.util.*;

public class LastConsonant {
    public static void main(String[] args) {
        String str = "Hello World!";
        char lastConsonant = SearchConsonant(str);
        if (lastConsonant != '\0') {
            System.out.println("The last consonant is: " + lastConsonant);
        } else {
            System.out.println("No consonant found.");
        }
    }
    static char SearchConsonant(String str) {
        if (str.length() == 0) {
            return '\0';
        }
        for (int i = str.length() - 1; i > 0; i--) {
            char ch = Character.toLowerCase(str.charAt(i));
            if (ch >= 'a' && ch <= 'z' && "aeiou".indexOf(ch) == -1) {
                return str.charAt(i);
            }
        }
        return '\0'; // Return null character if no consonant is found
    }
}



