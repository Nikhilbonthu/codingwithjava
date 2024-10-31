import java.util.*;

public class D2arrayproblem03 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
       //input
       int[][] arr=new int[3][3];
       for(int rows=0;rows<arr.length;rows++){
         for(int cols=0;cols<arr[rows].length;cols++){
arr[rows][cols]=scanner.nextInt();

         }
       }
       for(int rows=0;rows<arr.length;rows++){
        for(int cols=0;cols<arr[rows].length;cols++){
System.out.print(arr[rows][cols]+" ");
        }
        System.out.println();
}
for(int rows=0;rows<arr.length;rows++){


System.out.println(Arrays.toString(arr[rows]));
        }
        for(int[] num:arr){
            System.out.println(Arrays.toString(num));
        }
    }
    }

