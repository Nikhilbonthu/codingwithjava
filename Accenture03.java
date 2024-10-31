import java.util.Arrays;

public class Accenture03 {
    public static void main(String[] args) {
        int[] arr = { 11, 1, 2, 8, 10, 11, 15, 7 };
        System.out.println(Arrays.toString(MaxPair(arr)));
    }

    static int[] MaxPair(int[] arr) {
        int[] ans;
        int max_pro = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == 18) {
                    int temp = arr[i] * arr[j];
                    if (temp >= max_pro) {
                        max_pro = temp;
                    }
                    return new int[] { arr[i], arr[j] };
                }

            }

        }
        return new int[] { -1, -1 };

    }
}
