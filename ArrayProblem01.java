import java.util.*;

public class ArrayProblem01{
    public static void main(String[] args){
       Scanner scanner= new Scanner(System.in);
//        int[] arr=new int[5];
// System.out.println(arr[0]);  
// int arr[] =new int[5];
// for(int i=0;i<arr.length;i++){
//     arr[i]=scanner.nextInt();       

// }
// System.out.println(Arrays.toString(arr));
// for(int num:arr){
//     System.out.println(num);
// }
String str[] = new String[4];
for(int i=0;i<str.length;i++){
    str[i]=scanner.next();
}
System.out.println( Arrays.toString(str) );
str[1]="nikhil";
System.out.println(Arrays.toString(str));
}

}