import java.util.Arrays;

public class IBM03 {
    public static void main(String[] args) {
        int[] arr = {1,3,2,5,5};
        System.out.println(missingElement(arr));

    }
    static int missingElement(int[] arr) {
       int[] a = new int[arr.length];
        for(int i =0; i < a.length; i++){
            a[arr[i] - 1] = 1;
        }
        for(int i = 0; i < a.length; i++){
            if(a[i] == 0){
                return i + 1;
            }
        }
        return -1;
    }


}
