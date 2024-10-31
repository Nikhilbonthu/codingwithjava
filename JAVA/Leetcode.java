public class Leetcode {
  
        public static  boolean isSubsequence(String s, String t) {
            int m = s.length(), n = t.length();
            int i = 0, j = 0;
            while (i < m && j < n) {
                if (s.charAt(i) == t.charAt(j)) {
                    ++i;
                }
                ++j;
            }
            return i == m;
        }
        public static void main(String[] args) {
             String s = "abc";
             String  t = "ahbgdc";
             System.out.println(isSubsequence(s, t));
    }
}

