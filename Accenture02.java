public class Accenture02 {
    public static void main(String[] args) {
        String str = "HelloWorld";
        System.out.println(count(str));
    }
    static int count(String str){
        int count =0;
        char[] ch = str.toCharArray();
        for(int i : ch){
            count++;
        }
        return count;
    }
}
