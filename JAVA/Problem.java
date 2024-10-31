class Problem{
    public static void main(String[] args) {
        String str1 = "hide";
        String str2 = "race";
        System.out.println(countVowels(str1));
        System.out.println(isPalin(str1)+countVowels(str1));

    }
    static int countVowels(String str1){
        int count = 0;
    char[] ch = str1.toCharArray();
  for(int val:ch){
if(val=='a'||val=='e'||val=='i'||val=='o'||val=='u'){
 count++;
}
  }
  return count;
    }
    static int isPalin(String str1){
        char[]  ch = str1.toCharArray();
        int var = 1;
        for(int i = 0; i < str1.length()/2; i++){
           int start = str1.length()-1;
       if(ch[start] != ch[i]){
var = 0;
break;
       }
       start--;
        }
return var;
    }

}