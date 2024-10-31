public class IBM4 {
    public static void main(String[] args) {
        int[][] arr = { { 1, 2, 3 }, { 4, 5, 6 }, { 9, 8, 9 } };
        System.out.println(squareMatrix(arr));
    }

    static int squareMatrix(int[][] arr) {
        int sum = 0;
        int sum1 = 0;
        int diff = 0;
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr.length; col++) {
                if (row == col) {
                    sum += arr[row][col];
                } else if (row < arr[row].length - row) {
                    sum1 += arr[row][arr.length -1  - row];
                }
            }

            diff = sum1 - sum;
        }
        return diff;
    }
}
