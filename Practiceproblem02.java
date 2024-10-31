public class Practiceproblem02{
    //convert to lower case
    public static void main(String[] args) {
        System.out.println(toLowerCase("Nikhil"));
        System.out.println(toLowerCase1("Nikeerthihil"));
    }
    static String toLowerCase(String str){
        String result="";
     for(int i=0; i<str.length();i++){
        if('A'<=str.charAt(i) && str.charAt(i)<='Z'){
        result +=(char)(str.charAt(i)+32);
        }else{
            result +=(char)(str.charAt(i));
        }
     }

return result;

    }

static String toLowerCase1(String str){
    StringBuilder sb = new StringBuilder();

for(char c:str.toCharArray()){
    if(c>=65 && c<=90){
    c =(char)(c + 32);


    }
    sb.append(c);
}
return sb.toString();

}
}