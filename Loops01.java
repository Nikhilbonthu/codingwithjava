import java.util.*;
public class Loops01{
public static void main(String[] args){
    Scanner in = new Scanner(System.in);
    int ch=in.nextLine().trim().charAt(0);
   if(ch>='a'&&ch<='z'){
    System.out.println("Lowercase");
   }else{
    System.out.println("Uppercase");
   }
}

}
