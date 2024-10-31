import java.util.*;

public class SortedArray {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 4, 15, 8, 12 };
        Sorted(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(isSorted(arr, 0));
    }
// normal method
    static void Sorted(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[i]) {
                    int temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }
    }
    // using recursive function
    static boolean isSorted(int[] arr , int index){
//  base condition
 if(index == arr.length - 1){
return true;
 }
//  all arrays pointing to the object
return arr[index] < arr[index + 1] &&  isSorted(arr, index + 1);

    }
}



 