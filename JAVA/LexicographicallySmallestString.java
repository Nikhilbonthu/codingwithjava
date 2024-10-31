public class LexicographicallySmallestString {
    public static String getSmallestString(String s) {
        s = s.substring(1,4);
        char[] chars = s.toCharArray();
        int n = chars.length;
        boolean changed = false;

        for (int i = 0; i < n; i++) {
            if (chars[i] > 'a') {
                for (int j = i; j < n; j++) {
                    if (chars[j] == 'a')
                        break;
                    chars[j]--;
                }
                changed = true;
                break;
            }
        }

        if (!changed) {
            chars[n - 1] = 'z';
        }

        return new String(chars);
    }

    public static void main(String[] args) {
        String s = "hackerrank";
        System.out.println(getSmallestString(s)); // Output: "gackerrank"
    }
}
