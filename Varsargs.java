import java.lang.reflect.Array;
import java.util.*;
public class Varsargs{
    public static void main(String[] args){
     fun(1,2,3,2,2,1,212,13,2131,313,1);
     }
 static void fun(int...v){
System.out.println(Arrays.toString(v));
 }
}









