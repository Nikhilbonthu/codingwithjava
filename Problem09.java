import java.util.Arrays;

public class Problem09 {
    public static void main(String[] args) {
        int[] arr = { 0, 0, 1, 1, 1, 2, 2, 3, 3 };
        System.err.println(DuplicateOfSortedArray(arr));
        System.out.println(Arrays.toString(arr));
    }

    // here we using 2 pointer approach for clearance in understanding the problem.
    static int  DuplicateOfSortedArray(int[] arr) {
        // [0,0,1,1,1,,2,2,3,3,....]
        int j = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != arr[j]) {
                arr[++j] = arr[j];
            }
        }
        return j + 1;
    }
}