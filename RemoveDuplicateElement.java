import java.util.*;

public class RemoveDuplicateElement {
    public static void main(String[] args) {
        int[] arr = { 1, 1, 2, 2, 2, 3, 3 };
        // int k = removeDuplicate(arr);
        // System.out.println(k);
        // System.out.println("After removing duplicates :");
        // for (int i = 0; i < arr.length; i++) {
        // System.out.print(arr[i] + " ");
        // }
        removeDuplicate1(arr);
        System.out.println(Arrays.toString(arr));
    }

    static int removeDuplicate(int[] arr) {
        int i = 0;
        for (int j = i + 1; j < arr.length; j++) {
            if (arr[j] != arr[i]) {
                // i = i + 1;
                i++;
                arr[i] = arr[j];
            }
        }
        return i + 1;

    }

    static void removeDuplicate1(int[] arr) {
        // { 1, 1, 2, 2, 2, 3, 3 }
        int i = 0;
        for (int j = 1; j < arr.length; j++) {
            if (arr[j] != arr[i]) {
                // i = i + 1;
                i++;
                // arr[i] = arr[j];
                swap(arr, i, j);
            }
        }
    }

    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
