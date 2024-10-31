import java.util.*;
public class StringBuilder01 {
    public static void main(String[] args) {//=> flexibility String
        StringBuilder builder=new StringBuilder();
        String series=" ";
for(int i=0;i<26;i++){
    char ch=(char)('a'+i); 
builder.append(ch+series);//mutable string
}
     System.out.println((builder));
    //  builder.deleteCharAt(0);
    //  System.out.println(builder);
    String name="nikhil bonthu";
System.out.println(name.indexOf('i'));    
    char[] ch=name.toCharArray();
    for(char i:ch){
        System.out.println(i);
    }
    System.out.println(Arrays.toString(name.toCharArray()));
    System.out.println(name.toCharArray());
    System.out.println(name);
    System.out.println(name.toLowerCase());
    System.out.println(name.toUpperCase());
System.out.println(" nikhil".strip());
System.out.println(Arrays.toString(name.split(" ")));
}
}
