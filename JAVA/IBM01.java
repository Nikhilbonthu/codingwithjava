public class IBM01 {
    public static void main(String[] args) {
        String str = "101011";
        int result = minFlips(str);
        System.out.println(result);
    }

    static int minFlips(String str) {
        int countFlips = 0;
        char[] ch = str.toCharArray();
        for (int i = 0; i < str.length() - 1; i += 2) {
            if (ch[i] != ch[i + 1]) {
                countFlips++;
            }
        }
        return countFlips;
    }
}
