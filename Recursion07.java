import java.util.*;

public class Recursion07 {
    public static void main(String[] args) {
        int[] arr = { 1, 5, 2, 4, 3, 8, 9 };
        sortedTheArray(arr);
        System.out.println(Arrays.toString(arr));
    }

    // find the array is sorted or not using recursion
    static void sortedTheArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            for(int j = i + 1 ;j < arr.length; j++) {
            if (arr[i] > arr[j]) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        }
    }
}
