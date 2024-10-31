import java.util.Arrays;
import java.util.Scanner;

public class SearchInStrings {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String name="nikhil";
        char target='k';
        System.out.println(Arrays.toString(name.toCharArray()));
        System.out.println(search(name,target));
    }
    static boolean search(String str,char target) {
if(str.length()==0){
    return false;
}
//for(int i=0;i<str.length();i++){//if(target==str.charAt(i))}
    for(char ch:str.toCharArray()){
    if(ch==target){
return true;
}
}
    return false;
}
}
