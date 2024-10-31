import java.util.*;
public class Probelm {
    public static void main(String[] args) {
        int[] arr = { 2, 7, 4, 1, 5, 3 };
        BubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void BubbleSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int flag = 0;
            for (int j = 1; j < arr.length - i; j++) {
                if (arr[i] > arr[i + 1]) {
                    swap(arr[i], arr[i + 1]);
                }
            }
        }
    }

    private static void swap(int arr, int arrNext) {
        int temp = arrNext;
        arrNext = arr;
        arr = temp;
    }
}
