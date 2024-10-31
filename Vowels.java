public class Vowels {
    public static void main(String[] args) {
        boolean isContainsVolume= containVowels("nikhil");
        System.out.println(isContainsVolume);
        System.out.println(ContaonVowels("nikhil"));
    }
    public static boolean containVowels(String str){
str=str.toLowerCase();
for(int i=0; i<str.length();i++){
  char ch=str.charAt(i);
  if(ch=='a' || ch=='i' || ch=='o' || ch=='e' ||ch=='u'){
    return true;
  }

}
return false;
    }
    static boolean ContaonVowels(String str){
        str=str.toLowerCase();
        char[] ch=str.toCharArray();
for(char i:ch){
    if(i=='a' || i=='i' || i=='o' || i=='e' ||i=='u'){
        return true;
    }
}
return false;
    }
}

