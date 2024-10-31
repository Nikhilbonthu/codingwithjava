import java.util.Scanner;

/**
 * LinearSearch01
 */
public class LinearSearch01 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr={14};
        int data=scanner.nextInt();

System.out.println(Linear(arr,data));
    }
    static boolean Linear(int[] arr,int data){
        if(arr.length==0)
        {
            return false;
        }

        for(int index=0; index<arr.length; index++) 
        {
            if(arr[index]==data){
        return true;
            }
        }
    return false;
    }
}