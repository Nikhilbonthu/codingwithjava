public class Problem12 {
    public static void main(String[] args) {
        String str = "nikhil";
        System.out.println(testString(str));

    }

    static String testString(String str) {
        String result="";
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'a') {
                str.replace('a', 'z');

            } 
                char[] ch = str.toCharArray();
                result = str.replace(str.charAt(i),(char) (ch[i] - 1) );
            
        }
        return result;
    }
}