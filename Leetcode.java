import java.util.Arrays;
public class Leetcode{
    // find Minimum in Rotataed Sorted Array
    public static void main(String[] args) {
        int[] arr = { 3, 4, 5, 1, 2 };
        // System.out.println(Arrays.toString(arr));
        System.out.println(findMin(arr));
    }
    static int findMin(int[] arr) {
        // Binary search is used for sorted array
        int low = 0;
        int high = arr.length - 1;
        while (low < high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] > arr[high]) {
                low = mid + 1;
            } else {
                high = mid;
            }
        }
        return arr[high];
    }
}
