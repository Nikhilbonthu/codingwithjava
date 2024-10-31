public class Stringbuilder {
    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder("nikhil");
        System.out.println(sb);
        System.out.println(sb.charAt(0));//char at index 0
        //set char at index
sb.setCharAt(0, 'k');//overwritting char at index
System.out.println(sb);
sb.insert(0, 'n');//insert character
System.out.println(sb);
//delete character at index extra
sb.delete(2,4);
System.out.println(sb);
//append used to concentnste
String str="nikhil";
str=str+" bonthu";
System.out.println(str);
//string in reverse order
int n=str.length();
for(int i=0;i<n/2;i++)
{
   
    int front =i;
    int back =n-1-i;
    char frontchar=str.charAt(front);
    char backchar=str.charAt(back);
// str.setcharAt(front,back);
// str.setcharAt(back,front);


}
System.out.println(str);
    }
}
