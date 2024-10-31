public class Accenture {
    public static void main(String[] args) {
        String name = "nikhil";
        System.out.println(countOfString(name));
        System.out.println(countVowel(name, name));
    }
    static int countOfString(String str){
        int count = 0;
        char[] ch =  str.toCharArray();
        for(int val:ch){
            count++;
        }
        return count;
    }
    static int countVowel(String str1,String str2){
        int count = 0;
        str1= str1.toLowerCase();
        str2= str2.toLowerCase();
        char[] ch1 = str1.toCharArray();
        char[] ch2 = str2.toCharArray();
        for(int val:ch1){
            if(val=='a'||val=='i'||val=='o'||val=='u'||val=='e'){
               count++;
            }
        }
        return count;

    }
    
}
