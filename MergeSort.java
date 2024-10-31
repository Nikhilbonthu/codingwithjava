import java.util.*;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr = { 8, 3, 4, 12, 5, 6 };
        // new array take place to store data
        int[] ans = mergeSort(arr);
        System.out.println(Arrays.toString(ans));

    }

    // merge sort using recursion
    // s-1 :divide array into 2 parts
    // get parts sorted via recursion
    // merge the sorted parts
    // time complexity is O(nlogn)
    static int[] mergeSort(int[] arr) {
        if (arr.length == 1) {
            return arr;
        }
        int mid = arr.length / 2;
        int[] left = mergeSort(Arrays.copyOfRange(arr, 0, mid));
        int[] right = mergeSort(Arrays.copyOfRange(arr, mid, arr.length));
        return merge(left, right);
    }

    private static int[] merge(int[] first, int[] second) {
        int[] mix = new int[first.length + second.length];
        int i = 0;
        int j = 0;
        int k = 0;
        while (i < first.length && j < second.length) {
            if (first[i] < second[j]) {
                mix[k] = first[i];
                i++;
            } else {
                mix[k] = second[j];
                j++;
            }
            k++;
        }
        // it may be possible that one of the array is not complete
        while (i < first.length) {
            mix[k] = first[i];
            i++;
            k++;
        }
        while (j < second.length) {
            mix[k] = second[j];
            j++;
            k++;
        }
        return mix;
    }
    // complexity analysis
    /*
     
     */

}
