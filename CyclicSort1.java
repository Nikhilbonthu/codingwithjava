import java.util.Arrays;//amazon question

public class CyclicSort1 {// missing number
    public static void main(String[] args) {
        int[] arr = { 4, 0, 2, 1 };
        System.out.println(greaternumber(arr));
        missingNumber(arr);
        System.out.println(missingNumber(arr));
        System.out.println(Arrays.toString(arr));

    }

    static int missingNumber(int[] arr) {// value =index+1
        int Max_Value = greaternumber(arr);
        int i = 0;
        while (i < arr.length) {
            int correct = arr[i];
            if (arr[i] < arr.length && arr[i] != arr[correct]) {
                swap(arr, i, correct);
            } else {
                i++;
            }
        } // seaech for first missing number
        for (int index = 0; index < arr.length; index++) {
            if (arr[index] != index) {
                return index;
            }
        }
        return arr.length;
    }
    static int greaternumber(int[] arr) {
        int max = 0;
        for (int count : arr) {
            if (count > max) {
                max = count;
            }

        }
        return max;
    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;

    }
    // value =index
}
