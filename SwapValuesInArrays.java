import java.util.*;
/**
 * SwapValuesInArrays
 */
public class SwapValuesInArrays {

    public static void main(String[] args) {
        int[] arr={1,3,23,9,18};
        swap(arr, 1, 2);
        System.out.println(Arrays.toString(arr));
    }
    static void swap(int[] arr,int index1,int index2){
        int temp1 = arr[index1];
        arr[index1] = arr[index2];
        arr[index2]=temp1;

    }
}
