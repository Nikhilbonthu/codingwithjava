import java.util.Arrays;
public class Anagram {
    // examples are alert and later
    public static void main(String[] args) {
        String str1 = "alert";
        String str2 = "later";
        if (areAnagram(str1, str2)) {
            System.out.println("are anagram");
        } else {
            System.out.println("not anagram");
        }
    }
    public static boolean areAnagram(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }
        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        return Arrays.equals(arr1, arr2);
    }
}
