import java.util.*;
public class Strings01 {
    public static void main(String[] args){
        String name="nikhil";
        System.out.println(search("nikhil", 'k'));
    System.out.println(Arrays.toString(name.toCharArray()));
    }
//     static boolean search(String str,char target){
//        if(str.length()==0){
//         return false;
//        } 
//        for(int i=0;i<str.length();i++){
// if(target==str.charAt(i)){
// return true;
// }
//     }
//     return false;
// }
static boolean search(String str,char target)
{
    if(str.length()==0){
        return false;
    }
    for(char ch:str.toCharArray()){
        if(ch==target){
            return true;
        }
    }
    return false;
}
}