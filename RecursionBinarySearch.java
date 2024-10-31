import java.util.Arrays;

public class RecursionBinarySearch {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 55, 666, 78 };
        System.out.println(arr.length);
        System.out.println(BinarySearch(arr, 666, 0, arr.length - 1));

    }

    static int BinarySearch(int[] arr, int target, int start, int end) {
        if (start > end) {
            return -1;
        }
        int m = start + (end - start) / 2;
        if (arr[m] == target) {
            return m;
        }
        if (target < arr[m]) {
            return BinarySearch(arr, target, start, m - 1);
        }
        return BinarySearch(arr, target, m + 1, end);

    }
}
