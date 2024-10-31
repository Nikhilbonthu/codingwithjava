import java.io.PrintStream;
import java.util.*;
public class StringBasics2 {//place holders
    public static void main(String[] args) {
       PrintStream out = new PrintStream(System.out);
       out.println("hello world");
       int a ;
       out.println(a = 10);
       System.out.println("a"+"b");// create a new object=>ab       //in string get concentation and
       //it is not convert into value like asiic
       System.out.println('a'+'b');//char value get added 
       System.out.println("a"+1);//similiar like syso ("a"+"1");
       //note:integrer will be converted to Integer that will call toString()
   System.out.println("nikhil"+new ArrayList<>());
   System.out.println("nikhil"+new Integer(56));
//+ is used in primitives types and complex object but one is type string in complex

System.out.println(new Integer(56)+""+new ArrayList<>());
String ans=new Integer(56)+""+new ArrayList<>();
System.out.println(ans);
//in string +  is operator overloading=>concentation apply to string only
System.out.println((char)('a'+1));//=>explicity the value in char
//primitive store in stack and less space,easy to manipulate
//heap required co plex memory management
//string performance
String series=" ";
for(int i=0;i<26;i++){
    char ch=(char)('a'+i); 
    System.out.print(ch+series);//=>string+char=>concentattion of new object
//every iteration 
// point to every iteration => a,ab,abc,abcd,.....  and no refernce of variables
//time complexity O(N^2)
//1+2+3....+N=>N(N+1)/2=>N^2+N/2=>N^2 due to less dominating N and 1/2



}







}
    
    
}
